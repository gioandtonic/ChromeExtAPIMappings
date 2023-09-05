@file:JsQualifier("chrome.accesibilityFeatures")

package chrome.accesibilityfeatures

import chrome.types.ChromeSetting

external var animationPolicy: ChromeSetting<AnimationPolicyType>

enum class AnimationPolicyType {
    allowed,
    once,
    none
}