package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.2Pt  reason: invalid class name and case insensitive filesystem */
public class C49252Pt extends A34 {
    public final C133656pG A00;
    public final C218617r A01;
    public final C24921Me A02;
    public final C62182qv A03;
    public final C18030ve A04;
    public final AnonymousClass1BI A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final boolean A08;
    public final AnonymousClass11Z A09;

    public static Pair A00(C61372pZ r5) {
        int i;
        int i2 = r5.A00;
        if (i2 == 2) {
            i = 4;
        } else if (i2 == 3) {
            i = 1;
        } else if (i2 == 4) {
            i = 2;
        } else if (i2 != 1) {
            return null;
        } else {
            i = 3;
        }
        return new Pair((Object) null, i);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Pair pair;
        String A0U;
        String A0U2;
        BufferedInputStream bufferedInputStream;
        Context context = (Context) this.A06.get();
        if (context == null) {
            return null;
        }
        if (C18020vd.A05(C18040vf.A02, this.A04, 7584)) {
            String A0Q = C17890vO.A0Q();
            C24921Me r6 = this.A02;
            AnonymousClass1BI r11 = this.A05;
            AnonymousClass1E7 A0E = ((AnonymousClass1M9) r6.A05.get()).A0E(r11);
            if (A0E == null) {
                A0U2 = null;
            } else {
                A0U2 = r6.A0U(A0E, -1, false);
            }
            String replaceAll = C17880vN.A0q(context, A0U2, new Object[1], 0, 2131889642).replaceAll("[?:\\\\/*\"<>|\n\t\r]", "");
            if (!TextUtils.isEmpty(replaceAll)) {
                A0Q = replaceAll;
            }
            C61372pZ A012 = this.A03.A01(r11, A0Q, this.A08);
            pair = A00(A012);
            if (pair == null) {
                List<File> list = A012.A01;
                try {
                    ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(this.A01.A0T(A0Q))));
                    try {
                        byte[] bArr = new byte[16384];
                        for (File file : list) {
                            try {
                                bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 16384);
                                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                                while (true) {
                                    int read = bufferedInputStream.read(bArr, 0, 16384);
                                    if (read == -1) {
                                        break;
                                    }
                                    zipOutputStream.write(bArr, 0, read);
                                }
                                bufferedInputStream.close();
                            } catch (IOException e) {
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("Cannot zip file to share: ");
                                A10.append(file.getName());
                                C17880vN.A1M(A10, e);
                                throw e;
                            } catch (Throwable th) {
                                AnonymousClass0DT.A00(th, th);
                            }
                        }
                        zipOutputStream.close();
                        return C17890vO.A0E(new Intent("android.intent.action.SEND").setFlags(1).setType("application/zip").putExtra("android.intent.extra.SUBJECT", C17890vO.A0R(context, A0U2, 1, 0, 2131889642)).putExtra("android.intent.extra.TEXT", C17890vO.A0R(context, replaceAll, 1, 0, 2131889641)).putExtra("android.intent.extra.STREAM", C19680yj.A00().appendPath("export_chat_folder").appendEncodedPath(r11.getRawString()).appendEncodedPath(A0Q).build()), 0);
                    } catch (Throwable th2) {
                        zipOutputStream.close();
                        throw th2;
                    }
                } catch (IOException e2) {
                    Log.e("Cannot zip file to share ", e2);
                    return new Pair((Object) null, C17880vN.A0j());
                } catch (Throwable th3) {
                    AnonymousClass0DT.A00(th2, th3);
                }
            }
        } else {
            String A0Q2 = C17890vO.A0Q();
            C62182qv r1 = this.A03;
            AnonymousClass1BI r12 = this.A05;
            C61372pZ A013 = r1.A01(r12, A0Q2, this.A08);
            pair = A00(A013);
            if (pair == null) {
                List list2 = A013.A01;
                C24921Me r4 = this.A02;
                AnonymousClass1E7 A0E2 = ((AnonymousClass1M9) r4.A05.get()).A0E(r12);
                if (A0E2 == null) {
                    A0U = null;
                } else {
                    A0U = r4.A0U(A0E2, -1, false);
                }
                String replaceAll2 = C17880vN.A0q(context, A0U, new Object[1], 0, 2131889642).replaceAll("[?:\\\\/*\"<>|\n\t\r]", "");
                ArrayList A14 = AnonymousClass000.A14(list2);
                A14.add(C19680yj.A00().appendPath("export_chat").appendEncodedPath(r12.getRawString()).appendEncodedPath(A0Q2).build());
                int i = 1;
                while (i < list2.size()) {
                    try {
                        A14.add(C64062u9.A02(context, (File) list2.get(i)));
                        i++;
                    } catch (IllegalArgumentException e3) {
                        Log.e((Throwable) e3);
                        return new Pair((Object) null, C17880vN.A0j());
                    }
                }
                return C17890vO.A0E(new Intent("android.intent.action.SEND_MULTIPLE").setFlags(1).setType("text/*").putExtra("android.intent.extra.SUBJECT", C17890vO.A0R(context, A0U, 1, 0, 2131889642)).putExtra("android.intent.extra.TEXT", C17890vO.A0R(context, replaceAll2, 1, 0, 2131889641)).putParcelableArrayListExtra("android.intent.extra.STREAM", A14), 0);
            }
        }
        return pair;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        if (r7.A08 != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r2 != 4) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r8) {
        /*
            r7 = this;
            android.util.Pair r8 = (android.util.Pair) r8
            if (r8 == 0) goto L_0x002f
            java.lang.Object r3 = r8.first
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.Object r0 = r8.second
            int r2 = X.AnonymousClass000.A0M(r0)
            if (r2 == 0) goto L_0x0078
            r0 = 1
            if (r2 == r0) goto L_0x0030
            r0 = 3
            if (r2 == r0) goto L_0x009f
            r0 = 4
            r1 = 2131890234(0x7f12103a, float:1.9415154E38)
            if (r2 == r0) goto L_0x001f
        L_0x001c:
            r1 = 2131890233(0x7f121039, float:1.9415152E38)
        L_0x001f:
            java.lang.ref.WeakReference r0 = r7.A07
            java.lang.Object r0 = r0.get()
            X.1FR r0 = (X.AnonymousClass1FR) r0
            if (r0 == 0) goto L_0x002f
            r0.CEx()
            r0.BhQ(r1)
        L_0x002f:
            return
        L_0x0030:
            java.lang.ref.WeakReference r0 = r7.A07
            java.lang.Object r4 = r0.get()
            X.1FR r4 = (X.AnonymousClass1FR) r4
            if (r4 == 0) goto L_0x002f
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r3 = r0.get()
            android.content.Context r3 = (android.content.Context) r3
            r4.CEx()
            if (r3 == 0) goto L_0x002f
            boolean r0 = X.AnonymousClass11Z.A00()
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 == 0) goto L_0x006b
            r0 = 2131890235(0x7f12103b, float:1.9415156E38)
            X.C17880vN.A1A(r3, r1, r0)
            r1.append(r2)
            r0 = 2131895124(0x7f122354, float:1.9425072E38)
        L_0x005f:
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r4.BhR(r0)
            return
        L_0x006b:
            r0 = 2131890236(0x7f12103c, float:1.9415158E38)
            X.C17880vN.A1A(r3, r1, r0)
            r1.append(r2)
            r0 = 2131895125(0x7f122355, float:1.9425074E38)
            goto L_0x005f
        L_0x0078:
            java.lang.ref.WeakReference r0 = r7.A07
            java.lang.Object r4 = r0.get()
            X.1FR r4 = (X.AnonymousClass1FR) r4
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r2 = r0.get()
            android.content.Context r2 = (android.content.Context) r2
            if (r3 == 0) goto L_0x009f
            if (r4 == 0) goto L_0x009f
            if (r2 == 0) goto L_0x009f
            r4.CEx()
            X.6pG r1 = r7.A00
            r0 = 2131895676(0x7f12257c, float:1.9426192E38)
            java.lang.String r5 = r2.getString(r0)
            r6 = 0
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x009f:
            boolean r0 = r7.A08
            r1 = 2131890237(0x7f12103d, float:1.941516E38)
            if (r0 != 0) goto L_0x001f
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49252Pt.A0H(java.lang.Object):void");
    }

    public C49252Pt(Context context, AnonymousClass1FR r3, C133656pG r4, C218617r r5, C24921Me r6, AnonymousClass11Z r7, C62182qv r8, C18030ve r9, AnonymousClass1BI r10, boolean z) {
        this.A04 = r9;
        this.A05 = r10;
        this.A01 = r5;
        this.A00 = r4;
        this.A08 = z;
        this.A09 = r7;
        this.A02 = r6;
        this.A03 = r8;
        this.A06 = new WeakReference(context);
        this.A07 = new WeakReference(r3);
    }
}
