-keepnames class com.parse.** { *; }
-keepnames class com.tallygo.** { *; }

# Required for Parse
-keepattributes *Annotation*
-keepattributes Signature
# https://github.com/square/okio#proguard
-dontwarn okio.**
