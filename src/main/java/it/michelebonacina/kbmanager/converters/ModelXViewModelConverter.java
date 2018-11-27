package it.michelebonacina.kbmanager.converters;

import java.util.List;

public interface ModelXViewModelConverter<Model, ViewModel> {

	public Model toModel(ViewModel viewModel);
	
	public List<Model> toModelList(List<ViewModel> viewModelList);
	
	public ViewModel toViewModel(Model model);
	
	public List<ViewModel> toViewModelList(List<Model> modelList);
	
}
