package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import java.io.IOException;

/* renamed from: X.9ua  reason: invalid class name and case insensitive filesystem */
public class C196179ua {
    public int A00 = 0;
    public AA2 A01 = null;
    public String A02;
    public final Context A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass9W4 A05;
    public final AnonymousClass00H A06;
    public final Context A07;

    public AnonymousClass9A0 A01() {
        AnonymousClass9A0 r0;
        synchronized (this) {
            this.A00++;
            r0 = new AnonymousClass9A0(this);
        }
        return r0;
    }

    public C21327AiC A02() {
        C21327AiC aiC;
        synchronized (this) {
            this.A00++;
            aiC = new C21327AiC(this);
        }
        return aiC;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r3.getFileDescriptor() == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r7 = this;
            java.lang.String r6 = "GoogleMigrateClient/hasWhatsAppData()"
            r5 = 0
            X.9A0 r4 = r7.A01()     // Catch:{ 9LP | SecurityException -> 0x0048, all -> 0x0043 }
            android.os.IInterface r0 = r4.A00()     // Catch:{ all -> 0x0039 }
            com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService r0 = (com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService) r0     // Catch:{ all -> 0x0039 }
            android.os.ParcelFileDescriptor r3 = r0.BRf()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x001a
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x002d }
            r2 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "GoogleMigrateClient/hasWhatsAppData; hasFileDescriptor = "
            X.C17900vP.A0n(r0, r1, r2)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0029
            r3.close()     // Catch:{ all -> 0x0039 }
        L_0x0029:
            r4.close()     // Catch:{ 9LP | SecurityException -> 0x0048, all -> 0x0043 }
            return r2
        L_0x002d:
            r1 = move-exception
            if (r3 == 0) goto L_0x0038
            r3.close()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0039 }
        L_0x0038:
            throw r1     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ 9LP | SecurityException -> 0x0048, all -> 0x0043 }
        L_0x0042:
            throw r1     // Catch:{ 9LP | SecurityException -> 0x0048, all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
            return r5
        L_0x0048:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GoogleMigrateClient/hasWhatsAppData(): "
            X.C17900vP.A0Y(r2, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196179ua.A03():boolean");
    }

    public boolean A04(String str) {
        try {
            ApplicationInfo applicationInfo = this.A07.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            if (!applicationInfo.enabled) {
                return false;
            }
            int i = applicationInfo.flags;
            boolean A1O = AnonymousClass000.A1O(i & 1);
            boolean A1O2 = AnonymousClass000.A1O(i & 128);
            if (A1O || A1O2) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public C196179ua(Context context, AnonymousClass190 r3, AnonymousClass9W4 r4, AnonymousClass00H r5) {
        this.A03 = context;
        this.A04 = r3;
        this.A07 = context;
        this.A06 = r5;
        this.A05 = r4;
    }

    public ParcelFileDescriptor A00(String str) {
        Parcel obtain;
        Parcel obtain2;
        Object obj;
        try {
            AnonymousClass9A0 A012 = A01();
            try {
                AJ1 aj1 = (AJ1) ((IAppDataReaderService) A012.A00());
                obtain = Parcel.obtain();
                obtain2 = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                obtain.writeString(str);
                AnonymousClass000.A18(aj1.A00, obtain, obtain2, 2);
                Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
                if (obtain2.readInt() != 0) {
                    obj = creator.createFromParcel(obtain2);
                } else {
                    obj = null;
                }
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                obtain2.recycle();
                obtain.recycle();
                A012.close();
                return parcelFileDescriptor;
            } catch (Throwable th) {
                A012.close();
                throw th;
            }
        } catch (Exception e) {
            throw new IOException(str, e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }
}
