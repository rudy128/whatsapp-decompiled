package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import android.net.Uri;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.49b  reason: invalid class name and case insensitive filesystem */
public final class C826149b extends A34 {
    public final C42621yT A00 = new Object();
    public final C18000vb A01;
    public final C57172ie A02;
    public final AnonymousClass6n9 A03;
    public final AnonymousClass1ST A04;
    public final AnonymousClass1BI A05;
    public final WeakReference A06;

    public void A0E() {
        this.A00.A01();
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Cursor A0A;
        C62572rc r1;
        File file;
        AnonymousClass1ST r5 = this.A04;
        AnonymousClass1BI r4 = this.A05;
        C17900vP.A0Y(r4, "mediamsgstore/getMediaMessagesCount ", AnonymousClass000.A10());
        AnonymousClass1Ez r7 = new AnonymousClass1Ez(false);
        r7.A05("mediamsgstore/getMediaMessagesCount/");
        String str = C51012Wq.A09;
        int i = 0;
        String[] strArr = {String.valueOf(r5.A02.A09(r4))};
        try {
            C28781at A042 = r5.A08.get();
            try {
                A0A = ((C28801av) A042).A02.A0A(str, "GET_MEDIA_MESSAGES_SQL_ORDER_BY_SORT_ID", strArr);
                while (A0A.moveToNext() && !this.A02.isCancelled()) {
                    AnonymousClass206 A0h = C72463Mc.A0h(A0A, r4, r5.A0C);
                    if ((A0h instanceof AnonymousClass21V) && (r1 = ((AnonymousClass21V) A0h).A02) != null) {
                        if ((A0h.A0v.A02 || r1.A0V) && (file = r1.A0G) != null && C72473Md.A1Q(Uri.fromFile(file))) {
                            i++;
                        }
                    }
                }
                A0A.close();
                A042.close();
                r7.A02();
                C17900vP.A0j("mediamsgstore/getMediaMessagesCount count:", AnonymousClass000.A10(), i);
                AnonymousClass6n9 r0 = this.A03;
                C42621yT r12 = this.A00;
                return Integer.valueOf(i + r0.A00(r12, r4) + this.A02.A00(r12, r4));
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDiskIOException e) {
            r5.A06.A00(1);
            throw e;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1yT] */
    public C826149b(AnonymousClass3Ua r2, C18000vb r3, C57172ie r4, AnonymousClass6n9 r5, AnonymousClass1ST r6, AnonymousClass1BI r7) {
        C18070vi.A0s(r3, r5, r6, r4);
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A05 = r7;
        this.A06 = AnonymousClass3MW.A0z(r2);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        AnonymousClass3Ua r2 = (AnonymousClass3Ua) this.A06.get();
        if (r2 != null) {
            String format = this.A01.A0L().format(Integer.valueOf(A0M));
            C18070vi.A0X(format);
            r2.A0B.A0F(format);
        }
    }
}
