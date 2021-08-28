package com.xcq1.kat.frontend

import com.ccfraser.muirwik.components.MTypographyAlign
import com.ccfraser.muirwik.components.MTypographyVariant
import com.ccfraser.muirwik.components.card.mCard
import com.ccfraser.muirwik.components.mCssBaseline
import com.ccfraser.muirwik.components.mTypography
import kotlinx.css.padding
import kotlinx.css.px
import react.Props
import react.RBuilder
import react.RComponent
import react.State
import styled.css
import styled.styledDiv

class App : RComponent<Props, State>() {
    override fun RBuilder.render() {
        mCssBaseline()
        styledDiv {
            css {
                padding(16.px)
            }

            mCard {
                mTypography(text = "Kat", variant = MTypographyVariant.h3, align = MTypographyAlign.center)
            }
        }
    }
}

