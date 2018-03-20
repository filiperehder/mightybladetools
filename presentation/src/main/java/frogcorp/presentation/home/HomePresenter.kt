package frogcorp.presentation.home

class HomePresenter : HomeContract.Presenter {

    override fun onStart() = onViewReady()
    override fun onStop() = onViewGone()

    override fun onViewReady() {
        // Execute subscriber
    }

    override fun onViewGone() {
        // Dispose subscriber
    }
}