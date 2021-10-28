package com.lbit.fleet.interfaces

import com.lbit.fleet.data.DashboardData

interface IRecords {

    fun onNavigate(
        position: Int,
        dashboardData: DashboardData
    )
}