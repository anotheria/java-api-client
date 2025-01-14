

# INParam

A single parameter set for one object, for example face, describing the behaviour of the AI. Each object has default parameters that are set if these are empty.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inClass** | [**InClassEnum**](#InClassEnum) | The classification of the object, that the element refers to. Default parameter values are defined per classification object. The following list contains the default values for &#39;min&#39;, &#39;max&#39; and &#39;drawMode&#39; in order.  * _face_ _(1, 3, 0)_ - Classification for human faces. * _child (*)_ _(0, 0, 6)_ - Recognizes children&#39;s faces. * _adult (*)_ _(0, -1, 0)_ - Recognizes faces of adults that are not considered seniors. * _senior (*)_ _(0, -1, 0)_ - Recognizes faces of seniors. * _pose_ _(0, 0, 0)_ - The age can not be estimated, due to a pose that hides facial features. * _female (*)_ _(0, -1, 0)_ - Recognizes female faces.  * _male (*)_ _(0, -1, 0)_ - Recognizes male faces.  * _hand_ _(0, -1, 0)_ - Classification for recognizing hands. * _foot_ _(0, -1, 0)_ - Classification for recognizing feet. * _footwear_ _(0, -1, 0)_ - Classification for recognizing footwear. * _hair_ _(0, -1, 0)_ - Classification for recognizing hair.  * _hairless_ _(0, -1, 0)_ - Classification for recognizing no hair.  * _beard_ _(0, -1, 0)_ - Classification for recognizing beards.  * _moustache_ _(0, -1, 0)_ - Classification for recognizing moustaches.  * _headpiece_ _(0, -1, 0)_ - Classification for recognizing headpieces.  * _glasses_ _(0, -1, 0)_ - Classification for recognizing glasses.  * _sunglasses_ _(0, -1, 0)_ - Classification for recognizing sunglasses.  * _mask_ _(0, -1, 0)_ - Classification for recognizing medical masks.  * _breast_ _(0, 0, 2)_ - Object that recognizes female breasts. * _vulva_ _(0, 0, 2)_ - Object that recognizes vulvae. * _penis_ _(0, 0, 2)_ - Object that recognizes penises. * _vagina_ _(0, 0, 2)_ - Object that recognizes vaginae. * _buttocks_ _(0, 0, 2)_ - Object that recognizes buttocks. * _anus_ _(0, 0, 2)_ - Object that recognizes ani. * _toy_ _(0, -1, 0)_ - Object that recognizes sex toys. * _oral_ _(0, 0, 2)_ - Object that recognizes oral sex. * _penetration_ _(0, 0, 2)_ - Object that recognizes a sexual penetration penetration. * _illegalSymbols_ _(0, 0, 1)_ - Classification for symbols that are not permitted in Germany.  * _textRecognition_ _(0, 6, 6)_ - Classification for recognizing text occurrences.  _Classification objects that are marked with (*) are sub-classifications of face. Both face and the marked classification are affected by the given parameter values._  _Please be aware that the default values can be subject to change. This is due to the difficulty of recognizing certain objects e.g. objects that are classified as toy._ |  [optional]
**min** | **Integer** | The minimum amount of objects allowed on the source media. Setting the value to -1 will cause the AI to ignore this rule. |  [optional]
**max** | **Integer** | The maximum amount of objects allowed on the source media. Setting the value to -1 will cause the AI to ignore this rule. |  [optional]
**severity** | **Integer** | Set a value to define the severity of a broken rule of the given classification object. |  [optional]
**drawMode** | **Integer** | The draw mode that will be used for the creating the media.  * _0_ - will draw nothing, * _1_ - will draw a frame with class name surrounding the object, * _2_ - will draw a filled rectangle that will mask the object, * _3_ - is a combination between _1_ and _2_ (frame/name + mask), * _6_ - will blur the object and * _7_ - is a combination between _1_ and _6_ (frame/name + blur). |  [optional]
**grey** | **Integer** | A grey scale color to use for masking. &#39;0&#39; will represent black, while the maximum &#39;255&#39; will be white. |  [optional]
**scale** | **Float** | Scale of the draw rectangle around the classification object. Specify a value to increase or decrease the size of the border. |  [optional]



## Enum: InClassEnum

Name | Value
---- | -----
FACE | &quot;face&quot;
HAND | &quot;hand&quot;
FOOT | &quot;foot&quot;
FOOTWEAR | &quot;footwear&quot;
BREAST | &quot;breast&quot;
VULVA | &quot;vulva&quot;
PENIS | &quot;penis&quot;
VAGINA | &quot;vagina&quot;
BUTTOCKS | &quot;buttocks&quot;
ANUS | &quot;anus&quot;
ORAL | &quot;oral&quot;
PENETRATION | &quot;penetration&quot;
TOY | &quot;toy&quot;
CHILD | &quot;child&quot;
ADULT | &quot;adult&quot;
SENIOR | &quot;senior&quot;
POSE | &quot;pose&quot;
FEMALE | &quot;female&quot;
MALE | &quot;male&quot;
HAIR | &quot;hair&quot;
HAIRLESS | &quot;hairless&quot;
BEARD | &quot;beard&quot;
MOUSTACHE | &quot;moustache&quot;
HEADPIECE | &quot;headpiece&quot;
GLASSES | &quot;glasses&quot;
SUNGLASSES | &quot;sunglasses&quot;
MASK | &quot;mask&quot;
NUDITYCHECK | &quot;nudityCheck&quot;
AGEVERIFICATION | &quot;ageVerification&quot;
AGEESTIMATION | &quot;ageEstimation&quot;
ILLEGALSYMBOLS | &quot;illegalSymbols&quot;
TEXTRECOGNITION | &quot;textRecognition&quot;
ATTRIBUTESCHECK | &quot;attributesCheck&quot;



