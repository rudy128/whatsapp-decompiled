package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1kY  reason: invalid class name and case insensitive filesystem */
public class C34481kY {
    public final AnonymousClass1LA A00;
    public final C26911Ty A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass11C A03;
    public final AnonymousClass118 A04;
    public final C18000vb A05;
    public final AnonymousClass1KB A06;
    public final AnonymousClass1NL A07;

    public C128796gh A00(String str) {
        StringBuilder sb;
        C133926pj r5 = new C133926pj();
        try {
            for (String split : AnonymousClass72d.A01(str)) {
                AnonymousClass72d.A02(Arrays.asList(AnonymousClass72d.A00.split(split)), r5);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<C128926gu> list = r5.A02;
            if (list.size() <= 257) {
                sb.append("contactpicker/contact array separation (size: ");
                sb.append(list.size());
                sb.append(")");
                AnonymousClass1Ez r6 = new AnonymousClass1Ez(sb.toString());
                for (C128926gu r8 : list) {
                    try {
                        AnonymousClass118 r7 = this.A04;
                        AnonymousClass1M9 r2 = this.A02;
                        AnonymousClass11C r0 = this.A03;
                        C18000vb r52 = this.A05;
                        AnonymousClass73Y r1 = new AnonymousClass73Y(r2, r0, r7, r52);
                        r1.A06(r8);
                        r1.A04(this.A01);
                        AnonymousClass73C r22 = r1.A04;
                        try {
                            C54032dU r02 = new C54032dU(new C139136yH(this.A00, r52).A01(r22), r22);
                            arrayList2.add(r02);
                            arrayList.add(r02.A00);
                        } catch (C33281iZ e) {
                            Log.e((Throwable) new AnonymousClass2RP(e));
                            throw new AnonymousClass3K5();
                        }
                    } catch (C33281iZ e2) {
                        Log.e("Failed to generate VCard data, skip it.", e2);
                    }
                }
                r6.A02();
                String str2 = null;
                if (arrayList2.size() == 1) {
                    str2 = ((C54032dU) arrayList2.get(0)).A01.A02();
                }
                return new C128796gh(str2, arrayList, arrayList2);
            }
            sb = new StringBuilder();
            sb.append("Too many vCards for a contact array message: ");
            sb.append(list.size());
            Log.w(sb.toString());
            throw new AnonymousClass3K6();
        } catch (C33281iZ unused) {
            throw new AnonymousClass3K7();
        }
    }

    public String A01(Uri uri) {
        IOException th;
        AnonymousClass6QY r2;
        AnonymousClass11B A0O = this.A03.A0O();
        if (A0O != null) {
            AnonymousClass1NL r5 = this.A07;
            r5.A03(uri);
            try {
                C18070vi.A0d(uri, 0);
                ContentResolver A002 = AnonymousClass11B.A00(A0O);
                ((C138956xy) A0O.A01.get()).A00(AnonymousClass00R.A01, uri.getAuthority());
                AssetFileDescriptor openAssetFileDescriptor = A002.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    try {
                        r5.A05(openAssetFileDescriptor.getParcelFileDescriptor());
                        FileInputStream createInputStream = openAssetFileDescriptor.createInputStream();
                        try {
                            r2 = new AnonymousClass6QY(createInputStream, 10000000);
                            String A003 = AnonymousClass1EY.A00(r2);
                            C17960vV.A07(A003);
                            r2.close();
                            if (createInputStream != null) {
                                createInputStream.close();
                            }
                            openAssetFileDescriptor.close();
                            return A003;
                        } catch (Throwable th2) {
                            th = th2;
                            if (createInputStream != null) {
                                try {
                                    createInputStream.close();
                                } catch (Throwable th3) {
                                    AnonymousClass0DT.A00(th, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        if (openAssetFileDescriptor != null) {
                            openAssetFileDescriptor.close();
                        }
                        throw th4;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to open uri=");
                    sb.append(uri);
                    th = new IOException(sb.toString());
                    throw th;
                }
            } catch (SecurityException e) {
                throw new IOException(e);
            } catch (Throwable th5) {
                AnonymousClass0DT.A00(th4, th5);
            }
        } else {
            throw new IOException("Unable to open uri; cr=null");
        }
        throw th;
    }

    public C34481kY(AnonymousClass1LA r1, AnonymousClass1KB r2, C26911Ty r3, AnonymousClass1M9 r4, AnonymousClass11C r5, AnonymousClass118 r6, C18000vb r7, AnonymousClass1NL r8) {
        this.A04 = r6;
        this.A06 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r3;
    }

    public void A02(C33281iZ r8) {
        AnonymousClass1KB r1;
        int i;
        Log.e("vcardloader/exception", new AnonymousClass2RP(r8));
        if (r8 instanceof AnonymousClass3K7) {
            r1 = this.A06;
            i = 2131897737;
        } else if (r8 instanceof AnonymousClass3K6) {
            this.A06.A0G(this.A05.A0K(new Object[]{257}, 2131755072, 257), 0);
            return;
        } else if (r8 instanceof AnonymousClass3K5) {
            r1 = this.A06;
            i = 2131892360;
        } else {
            return;
        }
        r1.A08(i, 0);
    }
}
