package frogcorp.presentation

interface BaseView<in T : BasePresenter> {
    fun setPresenter(presenter: T)
}