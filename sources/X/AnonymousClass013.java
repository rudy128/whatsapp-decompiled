package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.013  reason: invalid class name */
public abstract class AnonymousClass013 {
    public static int A00 = -100;
    public static AnonymousClass015 A01 = new AnonymousClass015(new Object());
    public static boolean A02;
    public static AnonymousClass1HD A03;
    public static AnonymousClass1HD A04;
    public static Boolean A05;
    public static final AnonymousClass016 A06 = new AnonymousClass016();
    public static final Object A07 = new Object();
    public static final Object A08 = new Object();

    public static void A03(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (A00 != i) {
            A00 = i;
            synchronized (A07) {
                Iterator it = A06.iterator();
                while (it.hasNext()) {
                    AnonymousClass013 r1 = (AnonymousClass013) ((WeakReference) it.next()).get();
                    if (r1 != null) {
                        AnonymousClass01V.A0Q((AnonymousClass01V) r1, true, true);
                    }
                }
            }
        }
    }

    public abstract Context A0V(Context context);

    public abstract View A0W(String str, Context context, AttributeSet attributeSet);

    public abstract AnonymousClass02B A0X(AnonymousClass02H r1);

    public abstract void A0Y();

    public abstract void A0Z();

    public abstract void A0a();

    public abstract void A0b();

    public abstract void A0c();

    public abstract void A0d(int i);

    public abstract void A0e(int i);

    public abstract void A0f(View view);

    public abstract void A0g(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0h(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0i(Toolbar toolbar);

    public abstract void A0j(CharSequence charSequence);

    public static Object A02() {
        Context context;
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            AnonymousClass013 r0 = (AnonymousClass013) ((Reference) it.next()).get();
            if (r0 != null && (context = ((AnonymousClass01V) r0).A0k) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static void A05(AnonymousClass013 r3) {
        synchronized (A07) {
            A06(r3);
            A06.add(new WeakReference(r3));
        }
    }

    public static void A06(AnonymousClass013 r3) {
        synchronized (A07) {
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                AnonymousClass013 r0 = (AnonymousClass013) ((WeakReference) it.next()).get();
                if (r0 == r3 || r0 == null) {
                    it.remove();
                }
            }
        }
    }

    public static boolean A07(Context context) {
        if (A05 == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.A00(context).metaData;
                if (bundle != null) {
                    A05 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                A05 = false;
            }
        }
        return A05.booleanValue();
    }

    public static AnonymousClass1HD A00() {
        if (C1401770f.A00()) {
            Object A022 = A02();
            if (A022 != null) {
                return AnonymousClass1HD.A01(AnonymousClass0Ki.A00(A022));
            }
        } else {
            AnonymousClass1HD r0 = A03;
            if (r0 != null) {
                return r0;
            }
        }
        return AnonymousClass1HD.A00();
    }

    public static AnonymousClass1HD A01() {
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        android.util.Log.w("AppLocalesStorageHelper", java.lang.String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", new java.lang.Object[]{"androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"}));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00cf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.content.Context r10) {
        /*
            boolean r0 = A07(r10)
            if (r0 == 0) goto L_0x001a
            boolean r0 = X.C1401770f.A00()
            if (r0 == 0) goto L_0x001b
            boolean r0 = A02
            if (r0 != 0) goto L_0x001a
            X.015 r1 = A01
            X.0ZV r0 = new X.0ZV
            r0.<init>(r10)
            r1.execute(r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r9 = A08
            monitor-enter(r9)
            X.1HD r1 = A03     // Catch:{ all -> 0x00d0 }
            if (r1 != 0) goto L_0x003d
            X.1HD r0 = A04     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = X.AnonymousClass0D5.A00(r10)     // Catch:{ all -> 0x00d0 }
            X.1HD r0 = X.AnonymousClass1HD.A02(r0)     // Catch:{ all -> 0x00d0 }
            A04 = r0     // Catch:{ all -> 0x00d0 }
        L_0x0030:
            boolean r0 = r0.A07()     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x003a
            X.1HD r0 = A04     // Catch:{ all -> 0x00d0 }
            A03 = r0     // Catch:{ all -> 0x00d0 }
        L_0x003a:
            monitor-exit(r9)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c8
        L_0x003d:
            X.1HD r0 = A04     // Catch:{ all -> 0x00d0 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x003a
            X.1HD r0 = A03     // Catch:{ all -> 0x00d0 }
            A04 = r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r6 = r0.A05()     // Catch:{ all -> 0x00d0 }
            java.lang.String r8 = "locales"
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r0 = ""
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r0 == 0) goto L_0x005f
            r10.deleteFile(r2)     // Catch:{ all -> 0x00d0 }
            goto L_0x003a
        L_0x005f:
            r7 = 1
            r0 = 0
            java.io.FileOutputStream r5 = r10.openFileOutput(r2, r0)     // Catch:{ FileNotFoundException -> 0x00b9 }
            org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()     // Catch:{ all -> 0x00d0 }
            r2 = 0
            r4.setOutput(r5, r2)     // Catch:{ Exception -> 0x009e }
            java.lang.String r1 = "UTF-8"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x009e }
            r4.startDocument(r1, r0)     // Catch:{ Exception -> 0x009e }
            r4.startTag(r2, r8)     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = "application_locales"
            r4.attribute(r2, r0, r6)     // Catch:{ Exception -> 0x009e }
            r4.endTag(r2, r8)     // Catch:{ Exception -> 0x009e }
            r4.endDocument()     // Catch:{ Exception -> 0x009e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009e }
            r1.<init>()     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = "Storing App Locales : app-locales: "
            r1.append(r0)     // Catch:{ Exception -> 0x009e }
            r1.append(r6)     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = " persisted successfully."
            r1.append(r0)     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x009e }
            android.util.Log.d(r3, r0)     // Catch:{ Exception -> 0x009e }
            goto L_0x00b3
        L_0x009e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r1.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "Storing App Locales : Failed to persist app-locales: "
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            r1.append(r6)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c9 }
            android.util.Log.w(r3, r0, r2)     // Catch:{ all -> 0x00c9 }
        L_0x00b3:
            if (r5 == 0) goto L_0x003a
            r5.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003a
        L_0x00b9:
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x00d0 }
            r1[r0] = r2     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x00d0 }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x003a
        L_0x00c8:
            return
        L_0x00c9:
            r0 = move-exception
            if (r5 == 0) goto L_0x00cf
            r5.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass013.A04(android.content.Context):void");
    }
}
