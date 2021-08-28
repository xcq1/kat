package com.xcq1.kat.frontend

import com.ccfraser.muirwik.components.mThemeProvider
import com.ccfraser.muirwik.components.styles.createMuiTheme
import com.ccfraser.muirwik.components.styles.mStylesProvider
import kotlinext.js.jsObject
import kotlinx.browser.document
import react.dom.render

@JsModule("react-hot-loader")
private external val hotModule: dynamic
private val hot = hotModule.hot
private val module = js("module")

fun main() {
    val hotWrapper = hot(module)
    render(document.getElementById("root")) {
        mStylesProvider("jss-insertion-point") {
            mThemeProvider(theme = createMuiTheme(themeOptions = jsObject { palette = jsObject { type = "dark" } })) {
                hotWrapper(child(App::class) {})
            }
        }
    }
}
