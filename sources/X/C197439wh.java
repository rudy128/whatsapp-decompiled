package X;

import android.content.res.XmlResourceParser;
import java.util.ArrayList;

/* renamed from: X.9wh  reason: invalid class name and case insensitive filesystem */
public abstract class C197439wh {
    public static final Object A00 = C17880vN.A0p();
    public static volatile ArrayList A01;

    public static String A00(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlResourceParser.getAttributeValue((String) null, str);
        }
        return attributeValue;
    }
}
