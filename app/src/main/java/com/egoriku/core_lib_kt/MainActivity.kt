package com.egoriku.core_lib_kt

import android.os.Bundle
import android.view.View
import android.app.ProgressDialog
import com.egoriku.corelib_kt.arch.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(),
        MainContract.View, View.OnClickListener {


    private lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
        progressDialog = createProgressDialog()
    }

    private fun createProgressDialog(): ProgressDialog {
        val progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Loading")
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
        progressDialog.setCancelable(false)
        progressDialog.progress = 0
        return progressDialog
    }

    override fun initPresenter(): MainContract.Presenter {
        return MainPresenter()
    }

    override fun onClick(p0: View?) {
        presenter.doSomeWithDelay(15_000)
    }

    override fun showProgress() {
        progressDialog.show()
    }

    override fun hideProgress() {
        progressDialog.hide()
    }

    override fun updateProgressPercentage(percent: Int) {
        progressDialog.progress = percent
    }
}
