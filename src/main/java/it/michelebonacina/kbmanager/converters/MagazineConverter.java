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
		Magazine magazine = new Magazine();
		magazine.setId(viewModel.getId());
		magazine.setTitle(viewModel.getTitle());
		magazine.setNumber(viewModel.getNumber());
		magazine.setYear(viewModel.getYear());
		magazine.setMonth(viewModel.getMonth());
		magazine.setPages(viewModel.getPages());
		magazine.setEditor(viewModel.getEditor());
		return magazine;
	} // toModel

	@Override
	public List<Magazine> toModelList(List<MagazineViewModel> viewModelList) {
		List<Magazine> magazines = new ArrayList<Magazine>();
		for (MagazineViewModel magazineViewModel : viewModelList) {
			magazines.add(this.toModel(magazineViewModel));
		}
		return magazines;
	} // toModelList

	@Override
	public MagazineViewModel toViewModel(Magazine model) {
		MagazineViewModel magazineViewModel = new MagazineViewModel();
		magazineViewModel.setId(model.getId());
		magazineViewModel.setTitle(model.getTitle());
		magazineViewModel.setNumber(model.getNumber());
		magazineViewModel.setYear(model.getYear());
		magazineViewModel.setMonth(model.getMonth());
		magazineViewModel.setPages(model.getPages());
		magazineViewModel.setEditor(model.getEditor());
		return magazineViewModel;
	} // toViewModel

	@Override
	public List<MagazineViewModel> toViewModelList(List<Magazine> modelList) {
		List<MagazineViewModel> magazineViewModels = new ArrayList<MagazineViewModel>();
		for (Magazine magazine : modelList) {
			magazineViewModels.add(this.toViewModel(magazine));
		}
		return magazineViewModels;
	} // toViewModelList

} // MagazineConverter
