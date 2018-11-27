package it.michelebonacina.kbmanager.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.michelebonacina.kbmanager.models.Magazine;
import it.michelebonacina.kbmanager.viewmodels.MagazineViewModel;

@Component
public class MagazineConverter implements ModelXViewModelConverter<Magazine, MagazineViewModel> {

	@Override
	public Magazine toModel(MagazineViewModel viewModel) {
		Magazine magazine = new Magazine(viewModel.getTitle(), viewModel.getYear(), viewModel.getMonth(),
				viewModel.getNumber(), viewModel.getEditor(), viewModel.getPages());
		return magazine;
	}

	@Override
	public List<Magazine> toModelList(List<MagazineViewModel> viewModelList) {
		List<Magazine> magazines = new ArrayList<Magazine>();
		for (MagazineViewModel magazineViewModel : viewModelList) {
			magazines.add(this.toModel(magazineViewModel));
		}
		return magazines;
	}

	@Override
	public MagazineViewModel toViewModel(Magazine model) {
		MagazineViewModel magazineViewModel = new MagazineViewModel(model.getTitle(), model.getYear(), model.getMonth(),
				model.getNumber(), model.getEditor(), model.getPages());
		return magazineViewModel;
	}

	@Override
	public List<MagazineViewModel> toViewModelList(List<Magazine> modelList) {
		List<MagazineViewModel> magazineViewModels = new ArrayList<MagazineViewModel>();
		for (Magazine magazine : modelList) {
			magazineViewModels.add(this.toViewModel(magazine));
		}
		return magazineViewModels;
	}

}
