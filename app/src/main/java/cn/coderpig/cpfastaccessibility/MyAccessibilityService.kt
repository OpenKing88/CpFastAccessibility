package cn.coderpig.cpfastaccessibility

import android.util.Log
import cn.coderpig.cp_fast_accessibility.*

/**
 * Author: CoderPig
 * Date: 2023-03-24
 * Desc:
 */
class MyAccessibilityService : FastAccessibilityService() {
    override fun analyzeCallBack(wrapper: EventWrapper?, result: AnalyzeSourceResult) {
        result.findNodeByText("搜索").click()
        result.findAllTextNode(true).nodes.forEach { logD("$wrapper | $it ") }
    }
}