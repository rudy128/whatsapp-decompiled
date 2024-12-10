package X;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0D5  reason: invalid class name */
public abstract class AnonymousClass0D5 {
    public static String A00(Context context) {
        String str = "";
        try {
            FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, DefaultCrypto.UTF_8);
                int depth = newPullParser.getDepth();
                while (true) {
                    int next = newPullParser.next();
                    if (next != 1 && (next != 3 || newPullParser.getDepth() > depth)) {
                        if (next != 3 && next != 4 && newPullParser.getName().equals("locales")) {
                            str = newPullParser.getAttributeValue((String) null, "application_locales");
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (IOException | XmlPullParserException unused) {
                Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
            if (openFileInput != null) {
                try {
                    openFileInput.close();
                } catch (IOException unused3) {
                }
            }
            if (!str.isEmpty()) {
                Log.d("AppLocalesStorageHelper", AnonymousClass001.A1H("Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ", str, AnonymousClass000.A10()));
                return str;
            }
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return str;
        } catch (FileNotFoundException unused4) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return str;
        }
    }
}
