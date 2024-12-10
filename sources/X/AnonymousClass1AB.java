package X;

import android.os.StrictMode;
import android.text.TextUtils;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.1AB  reason: invalid class name */
public abstract class AnonymousClass1AB {
    public abstract int A02(StrictMode.ThreadPolicy threadPolicy, String str, int i);

    public void A03(int i) {
        int indexOf;
        int i2;
        if (this instanceof AnonymousClass1AD) {
            ((AnonymousClass1AD) this).A02.A03(i);
        } else if (this instanceof AnonymousClass2A7) {
            AnonymousClass2A7 r5 = (AnonymousClass2A7) this;
            String str = null;
            for (String str2 : r5.A02) {
                if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf(33)) >= 0 && (i2 = indexOf + 2) < str2.length()) {
                    str = str2.substring(i2);
                }
                if (!TextUtils.isEmpty(str)) {
                    ZipFile zipFile = new ZipFile(r5.A00);
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                            if (zipEntry != null && zipEntry.getName().startsWith(str) && zipEntry.getName().endsWith(".so") && zipEntry.getMethod() == 0) {
                                String substring = zipEntry.getName().substring(str.length() + 1);
                                synchronized (r5) {
                                    Map map = r5.A01;
                                    if (!map.containsKey(str2)) {
                                        map.put(str2, new HashSet());
                                    }
                                    ((Set) map.get(str2)).add(substring);
                                }
                            }
                        }
                        zipFile.close();
                    } catch (Throwable th) {
                        try {
                            zipFile.close();
                            throw th;
                        } catch (Throwable th2) {
                            AnonymousClass0DT.A00(th, th2);
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
