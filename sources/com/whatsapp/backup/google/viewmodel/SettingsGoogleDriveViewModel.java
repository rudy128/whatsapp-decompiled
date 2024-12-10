package com.whatsapp.backup.google.viewmodel;

import X.AA1;
import X.AMZ;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11E;
import X.AnonymousClass11J;
import X.AnonymousClass18K;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1NT;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BS;
import X.AnonymousClass8BV;
import X.AnonymousClass8BY;
import X.AnonymousClass8h1;
import X.C108965cb;
import X.C167758gu;
import X.C170888qp;
import X.C17890vO;
import X.C180279Lx;
import X.C18030ve;
import X.C183849Zv;
import X.C196239ug;
import X.C19830z4;
import X.C199349zq;
import X.C21424Ajr;
import X.C27431Wb;
import X.C36801oU;
import X.C36841oY;
import X.C36851oZ;
import X.C36861oa;
import X.C59732mn;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class SettingsGoogleDriveViewModel extends AnonymousClass1J2 implements AnonymousClass11J {
    public static final int[] A0g;
    public static final int[] A0h = {0, 4, 1, 2, 3};
    public final ServiceConnection A00 = new AA1(this, 2);
    public final ConditionVariable A01 = new ConditionVariable(false);
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A05 = AnonymousClass3MW.A0M(AnonymousClass000.A0i());
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A07 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A08 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A09 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0A = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0B = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0C = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0D = C108965cb.A0D(10);
    public final AnonymousClass1DT A0E = AnonymousClass3MW.A0M(new C183849Zv(10, (Bundle) null));
    public final AnonymousClass1DT A0F = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0G = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0H = AnonymousClass3MW.A0M(C17890vO.A0L());
    public final AnonymousClass1DT A0I = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0J = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0K = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0M = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0N = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0O = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0P = AnonymousClass3MW.A0L();
    public final AnonymousClass1NT A0Q;
    public final C36801oU A0R;
    public final C196239ug A0S;
    public final C36841oY A0T;
    public final C36861oa A0U;
    public final C199349zq A0V;
    public final C36851oZ A0W;
    public final AnonymousClass11E A0X;
    public final C19830z4 A0Y;
    public final C27431Wb A0Z;
    public final C18030ve A0a;
    public final AnonymousClass18K A0b;
    public final AnonymousClass10I A0c;
    public final AnonymousClass00H A0d;
    public final AtomicBoolean A0e = new AtomicBoolean();
    public final AtomicBoolean A0f = new AtomicBoolean();

    static {
        int[] iArr = new int[5];
        AnonymousClass8BY.A1O(iArr);
        A0g = iArr;
    }

    public void A0S() {
        this.A0X.unregisterObserver(this);
        this.A0T.A02(this.A0W);
    }

    public void A0T() {
        AnonymousClass1DT r1;
        AnonymousClass8h1 r0;
        C19830z4 r12 = this.A0Y;
        String A0f2 = r12.A0f();
        if (!TextUtils.isEmpty(A0f2)) {
            long j = C17890vO.A0B(r12).getLong(AnonymousClass001.A1H("gdrive_last_successful_backup_video_size:", A0f2, AnonymousClass000.A10()), -1);
            if (j > 0) {
                r1 = this.A0P;
                r0 = new AnonymousClass8h1(j);
                r1.A0F(r0);
                return;
            }
        }
        Object A062 = this.A0F.A06();
        Boolean bool = Boolean.TRUE;
        r1 = this.A0P;
        if (A062 != bool) {
            r0 = null;
            r1.A0F(r0);
            return;
        }
        r1.A0F(new Object());
        C21424Ajr.A00(this.A0c, this, 10);
    }

    public void A0U() {
        C21424Ajr.A00(this.A0c, this, 11);
        A0T();
        C19830z4 r4 = this.A0Y;
        String A0f2 = r4.A0f();
        int i = 0;
        if (A0f2 != null) {
            boolean A2Z = r4.A2Z(A0f2);
            int A0M2 = r4.A0M(A0f2);
            if (A2Z || A0M2 == 0) {
                i = A0M2;
            } else {
                r4.A1k(A0f2, 0);
            }
        }
        AnonymousClass3MX.A1J(this.A0J, i);
    }

    public void A0V(int i) {
        AnonymousClass00H r2 = this.A0d;
        AnonymousClass8BS.A0A(r2).A0G(i);
        AnonymousClass3MX.A1J(this.A04, AnonymousClass8BV.A02(r2));
    }

    public void A0W(int i, int i2) {
        C170888qp r1 = new C170888qp();
        r1.A02 = String.valueOf(1);
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(i2);
        this.A0b.CC7(r1);
    }

    public void Bps(C59732mn r5) {
        int A032 = this.A0X.A03(true);
        AnonymousClass3MX.A1K(this.A03, A032);
        if (A032 == 0 || A032 == 2) {
            C180279Lx r1 = (C180279Lx) this.A08.A06();
            if (r1 instanceof C167758gu) {
                int i = ((C167758gu) r1).A00;
                if (i == 0) {
                    this.A0W.By4(0, 0);
                } else if (i == 6 || i == 7) {
                    this.A0W.BmJ(0, 0);
                }
            }
        }
    }

    public SettingsGoogleDriveViewModel(AnonymousClass1KB r8, AnonymousClass1NT r9, C36801oU r10, C196239ug r11, C36841oY r12, C36861oa r13, C199349zq r14, AnonymousClass11E r15, C19830z4 r16, C27431Wb r17, C18030ve r18, AnonymousClass18K r19, AnonymousClass10I r20, AnonymousClass00H r21) {
        this.A0a = r18;
        this.A0c = r20;
        this.A0b = r19;
        this.A0Q = r9;
        this.A0Z = r17;
        this.A0S = r11;
        C19830z4 r6 = r16;
        this.A0Y = r6;
        this.A0d = r21;
        this.A0X = r15;
        this.A0V = r14;
        this.A0R = r10;
        this.A0U = r13;
        this.A0T = r12;
        AnonymousClass1KB r2 = r8;
        this.A0W = new AMZ(r2, r13, this, r15, r6);
    }
}
