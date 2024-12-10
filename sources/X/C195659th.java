package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.9th  reason: invalid class name and case insensitive filesystem */
public class C195659th {
    public long A00 = 0;
    public SharedPreferences.Editor A01;
    public SharedPreferences A02;
    public B4H A03;
    public B4I A04;
    public B6Y A05;
    public PreferenceScreen A06;
    public String A07;
    public boolean A08;
    public Context A09;

    /* JADX INFO: finally extract failed */
    public PreferenceScreen A02(Context context, PreferenceScreen preferenceScreen, int i) {
        InflateException inflateException;
        int next;
        PreferenceGroup preferenceGroup;
        this.A08 = true;
        A73 a73 = new A73(context, this);
        Context context2 = a73.A02;
        XmlResourceParser xml = context2.getResources().getXml(i);
        try {
            Object[] objArr = a73.A03;
            synchronized (objArr) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                objArr[0] = context2;
                do {
                    try {
                        next = xml.next();
                        if (next == 2) {
                            preferenceGroup = (PreferenceGroup) A73.A00(asAttributeSet, a73, xml.getName());
                            if (preferenceScreen == null) {
                                preferenceGroup.A0F(a73.A00);
                            } else {
                                preferenceGroup = preferenceScreen;
                            }
                            A73.A02(asAttributeSet, preferenceGroup, a73, xml);
                        }
                    } catch (InflateException e) {
                        throw e;
                    } catch (XmlPullParserException e2) {
                        e = e2;
                        inflateException = new InflateException(e.getMessage());
                        inflateException.initCause(e);
                        throw inflateException;
                    } catch (IOException e3) {
                        e = e3;
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append(xml.getPositionDescription());
                        inflateException = new InflateException(C17900vP.A0C(": ", A10, e));
                        inflateException.initCause(e);
                        throw inflateException;
                    }
                } while (next != 1);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append(xml.getPositionDescription());
                throw new InflateException(AnonymousClass000.A0y(": No start tag found!", A102));
            }
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceGroup;
            preferenceScreen2.A0F(this);
            SharedPreferences.Editor editor = this.A01;
            if (editor != null) {
                editor.apply();
            }
            this.A08 = false;
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public SharedPreferences.Editor A00() {
        if (!this.A08) {
            return A01().edit();
        }
        SharedPreferences.Editor editor = this.A01;
        if (editor != null) {
            return editor;
        }
        SharedPreferences.Editor edit = A01().edit();
        this.A01 = edit;
        return edit;
    }

    public SharedPreferences A01() {
        SharedPreferences sharedPreferences = this.A02;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = this.A09.getSharedPreferences(this.A07, 0);
        this.A02 = sharedPreferences2;
        return sharedPreferences2;
    }

    public C195659th(Context context) {
        this.A09 = context;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(context.getPackageName());
        this.A07 = AnonymousClass000.A0y("_preferences", A10);
        this.A02 = null;
    }
}
