package com.yakymovych.simon.yogaapp.presentation.ui.main

import com.yakymovych.simon.yogaapp.presentation.ui.BaseViewModel

import com.yakymovych.simon.yogaapp.data.repository.Repository
import javax.inject.Inject


class MainViewModel @Inject constructor(private val repository: Repository): BaseViewModel() {

//    var tasks: LiveData<PagedList<Task>>
//    var sort: Int  = R.id.action_sort_id
//    var isResfreshing = MutableLiveData<Boolean>()
//    var pagedListConfig = PagedList.Config.Builder()
//            .setEnablePlaceholders(true)
//            .setInitialLoadSizeHint(10)
//            .setPageSize(LIMIT).build()
//
//    companion object {
//        var LIMIT = 15
//    }
//    init  {
//        tasks = LivePagedListBuilder<Int, Task>(tasksFactory, pagedListConfig).
//                setInitialLoadKey(0).
//                build()
//
//    }
//
//    var refreshListener = OnRefreshListener {
//        this.isResfreshing.value = true
//        refreshTasks()
//    }
//
//    fun selectSort(sort: Sort,resourse: Int){
//        Timber.d { "SORT SELECTED: " + sort.name }
//        this.sort = resourse
//        tasksFactory.sort = sort
//        refreshTasks()
//    }
//    fun refreshTasks(){
//        Timber.d { "REFRESHING" }
//        tasksFactory.dataSource.value?.invalidate()
//    }
}