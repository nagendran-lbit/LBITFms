package com.lbit.fleet.interfaces

import com.lbit.fleet.data.DashboardData

interface IPartED {

    fun onNavigate(
        position: Int,
        dashboardData: DashboardData,
        status:String
    )
}