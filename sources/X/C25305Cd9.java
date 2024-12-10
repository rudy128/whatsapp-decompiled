package X;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.Cd9  reason: case insensitive filesystem */
public abstract class C25305Cd9 {
    public static boolean A00(String str, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 3 || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean A01(String str, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2 || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }
}
