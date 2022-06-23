package com.example.apparquitectura.presenter

import com.example.apparquitectura.model.Coupon

interface CouponPresenter {
    //VISTA
    fun showCoupons(coupons: ArrayList<Coupon>?)

    //INTERACTOR
    fun getCoupons()
}