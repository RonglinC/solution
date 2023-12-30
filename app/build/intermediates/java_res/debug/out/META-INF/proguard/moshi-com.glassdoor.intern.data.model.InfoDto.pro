-if class com.glassdoor.intern.data.model.InfoDto
-keepnames class com.glassdoor.intern.data.model.InfoDto
-if class com.glassdoor.intern.data.model.InfoDto
-keep class com.glassdoor.intern.data.model.InfoDtoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.glassdoor.intern.data.model.InfoDto
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.glassdoor.intern.data.model.InfoDto
-keepclassmembers class com.glassdoor.intern.data.model.InfoDto {
    public synthetic <init>(com.glassdoor.intern.data.model.HeaderInfoDto,java.util.List,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
