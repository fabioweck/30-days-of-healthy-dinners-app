package com.example.a30daysapp.data

import androidx.compose.ui.res.stringResource
import com.example.a30daysapp.R
import com.example.a30daysapp.model.Dinner

class Datasource {
    fun LoadDinners(): List<Dinner>
    {
        return listOf<Dinner>(
            Dinner(R.string.dinner1_day, R.string.dinner1_name, R.drawable.dinner_1 , R.string.dinner1_details),
            Dinner(R.string.dinner2_day, R.string.dinner2_name, R.drawable.dinner_2 , R.string.dinner2_details),
            Dinner(R.string.dinner3_day, R.string.dinner3_name, R.drawable.dinner_3 , R.string.dinner3_details),
            Dinner(R.string.dinner4_day, R.string.dinner4_name, R.drawable.dinner_4 , R.string.dinner4_details),
            Dinner(R.string.dinner5_day, R.string.dinner5_name, R.drawable.dinner_5 , R.string.dinner5_details),
            Dinner(R.string.dinner6_day, R.string.dinner6_name, R.drawable.dinner_6 , R.string.dinner6_details),
            Dinner(R.string.dinner7_day, R.string.dinner7_name, R.drawable.dinner_7 , R.string.dinner7_details),
            Dinner(R.string.dinner8_day, R.string.dinner8_name, R.drawable.dinner_8 , R.string.dinner8_details),
            Dinner(R.string.dinner9_day, R.string.dinner9_name, R.drawable.dinner_9 , R.string.dinner9_details),
            Dinner(R.string.dinner10_day, R.string.dinner10_name, R.drawable.dinner_10 , R.string.dinner10_details),
            Dinner(R.string.dinner11_day, R.string.dinner11_name, R.drawable.dinner_11 , R.string.dinner11_details),
            Dinner(R.string.dinner12_day, R.string.dinner12_name, R.drawable.dinner_12 , R.string.dinner12_details),
            Dinner(R.string.dinner13_day, R.string.dinner13_name, R.drawable.dinner_13 , R.string.dinner13_details),
            Dinner(R.string.dinner14_day, R.string.dinner14_name, R.drawable.dinner_14 , R.string.dinner14_details),
            Dinner(R.string.dinner15_day, R.string.dinner15_name, R.drawable.dinner_15 , R.string.dinner15_details),
            Dinner(R.string.dinner16_day, R.string.dinner16_name, R.drawable.dinner_16 , R.string.dinner16_details),
            Dinner(R.string.dinner17_day, R.string.dinner17_name, R.drawable.dinner_17 , R.string.dinner17_details),
            Dinner(R.string.dinner18_day, R.string.dinner18_name, R.drawable.dinner_18 , R.string.dinner18_details),
            Dinner(R.string.dinner19_day, R.string.dinner19_name, R.drawable.dinner_19 , R.string.dinner19_details),
            Dinner(R.string.dinner20_day, R.string.dinner20_name, R.drawable.dinner_20 , R.string.dinner20_details),
            Dinner(R.string.dinner21_day, R.string.dinner21_name, R.drawable.dinner_21 , R.string.dinner21_details),
            Dinner(R.string.dinner22_day, R.string.dinner22_name, R.drawable.dinner_22 , R.string.dinner22_details),
            Dinner(R.string.dinner23_day, R.string.dinner23_name, R.drawable.dinner_23 , R.string.dinner23_details),
            Dinner(R.string.dinner24_day, R.string.dinner24_name, R.drawable.dinner_24 , R.string.dinner24_details),
            Dinner(R.string.dinner25_day, R.string.dinner25_name, R.drawable.dinner_25 , R.string.dinner25_details),
            Dinner(R.string.dinner26_day, R.string.dinner26_name, R.drawable.dinner_26 , R.string.dinner26_details),
            Dinner(R.string.dinner27_day, R.string.dinner27_name, R.drawable.dinner_27 , R.string.dinner27_details),
            Dinner(R.string.dinner28_day, R.string.dinner28_name, R.drawable.dinner_28 , R.string.dinner28_details),
            Dinner(R.string.dinner29_day, R.string.dinner29_name, R.drawable.dinner_29 , R.string.dinner29_details),
            Dinner(R.string.dinner30_day, R.string.dinner30_name, R.drawable.dinner_30 , R.string.dinner30_details)
        )
    }
}