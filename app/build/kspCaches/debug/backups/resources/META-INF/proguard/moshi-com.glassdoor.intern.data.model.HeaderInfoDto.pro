-if class com.glassdoor.intern.data.model.HeaderInfoDto
-keepnames class com.glassdoor.intern.data.model.HeaderInfoDto
-if class com.glassdoor.intern.data.model.HeaderInfoDto
-keep class com.glassdoor.intern.data.model.HeaderInfoDtoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.glassdoor.intern.data.model.HeaderInfoDto
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.glassdoor.intern.data.model.HeaderInfoDto
-keepclassmembers class com.glassdoor.intern.data.model.HeaderInfoDto {
    public synthetic <init>(java.lang.String,java.util.List,java.time.LocalDateTime,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
