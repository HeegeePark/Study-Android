package com.example.study0417

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.widget.ImageView
import android.widget.LinearLayout
import java.text.FieldPosition
// Indicator = 화면을 전환하는데 몇번째 화면인지 표시하기 위한 뷰
// 1. 변수 초기화
// 2. dp를 픽셀로 전환
// 3. 원을 만들어주고
// 4. 선택된 점표시
class CircleIndicator:LinearLayout{
    private var mContext: Context?=null
    private var mDefaultCircle:Int =0
    private var mSelectCircle:Int =0
    private var imageDot:MutableList<ImageView> = mutableListOf()

    private val temp = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,4.5f,resources.displayMetrics)

    //뷰를 인스턴스화
    constructor(context: Context):super(context){
        mContext = context
    }

    //인플레이팅화
    constructor(context: Context,attributeSet: AttributeSet):super(context,attributeSet){
        mContext = context
    }


    fun createDotPanel(count:Int,defaultCircle:Int,selectCircle:Int,position: Int) {

        this.removeAllViews()

        mDefaultCircle = defaultCircle
        mSelectCircle = selectCircle

        for (i in 0 until count) {       // 마지막 인덱스까지 도달하면 마지막값 -1
            imageDot.add(ImageView(mContext).apply { setPadding(temp.toInt(), 0, temp.toInt(), 0) })

            this.addView(imageDot[i])
        }
        selectDot(position)
    }

    fun selectDot(position: Int){
        for(i in imageDot.indices) {
            if(i==position) imageDot[i].setImageResource(mSelectCircle)
            else imageDot[i].setImageResource(mDefaultCircle)
        }
    }

}