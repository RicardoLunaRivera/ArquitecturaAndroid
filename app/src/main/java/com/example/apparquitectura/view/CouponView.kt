package com.example.apparquitectura.view

import com.example.apparquitectura.model.Coupon

interface CouponView {
    //VIEW
    fun showCoupons(coupons: ArrayList<Coupon>?)

    //PRESENTER
    fun getCoupons()

}