package X;

import android.view.ViewGroup;
import android.widget.ScrollView;
import com.whatsapp.status.widget.StatusEditText;
import com.whatsapp.util.Log;

/* renamed from: X.6xY  reason: invalid class name and case insensitive filesystem */
public final class C138706xY {
    public int A00;
    public AnonymousClass6Id A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final ViewGroup A05;
    public final ScrollView A06;
    public final AnonymousClass1DT A07;
    public final AnonymousClass1KB A08;
    public final AnonymousClass3TA A09;
    public final AnonymousClass11C A0A;
    public final AnonymousClass1L2 A0B;
    public final AnonymousClass1KW A0C;
    public final C18030ve A0D;
    public final AnonymousClass1BI A0E;
    public final C32011gU A0F;
    public final C32511hJ A0G;
    public final C18010vc A0H;
    public final C56972iK A0I;
    public final C32741hg A0J;
    public final StatusEditText A0K;
    public final C131676lU A0L;
    public final AnonymousClass7J1 A0M;
    public final AnonymousClass00H A0N;

    public static final int A00(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        if (charSequence == null) {
            Log.e("textstatus/linecount/str-null");
        } else {
            int length = charSequence.length();
            if (i < 0 || i2 > length || i > i2) {
                throw new IndexOutOfBoundsException("Invalid index");
            }
            while (i < i2) {
                if (charSequence.charAt(i) == 10) {
                    i3++;
                }
                i++;
            }
        }
        return i3;
    }

    public C138706xY(ViewGroup viewGroup, ScrollView scrollView, AnonymousClass1DT r16, AnonymousClass1KB r17, AnonymousClass3TA r18, AnonymousClass11C r19, AnonymousClass1L2 r20, AnonymousClass1KW r21, C18030ve r22, AnonymousClass1BI r23, C32011gU r24, C32511hJ r25, C18010vc r26, C56972iK r27, C32741hg r28, StatusEditText statusEditText, C131676lU r30, AnonymousClass7J1 r31, AnonymousClass00H r32) {
        C32511hJ r5 = r25;
        C18030ve r7 = r22;
        C32011gU r6 = r24;
        AnonymousClass1KW r8 = r21;
        AnonymousClass11C r10 = r19;
        C18070vi.A0w(r7, r6, r8, r5, r10);
        C32741hg r2 = r28;
        AnonymousClass00H r1 = r32;
        C18010vc r4 = r26;
        C56972iK r3 = r27;
        AnonymousClass1L2 r9 = r20;
        C18070vi.A0x(r3, r2, r4, r9, r1);
        AnonymousClass1KB r11 = r17;
        C18070vi.A0d(r11, 11);
        C131676lU r12 = r30;
        C18070vi.A0d(r12, 15);
        this.A0D = r7;
        this.A0F = r6;
        this.A0C = r8;
        this.A0G = r5;
        this.A0A = r10;
        this.A0I = r3;
        this.A0J = r2;
        this.A0H = r4;
        this.A0B = r9;
        this.A0N = r1;
        this.A08 = r11;
        this.A0E = r23;
        this.A05 = viewGroup;
        this.A0K = statusEditText;
        this.A0L = r12;
        this.A09 = r18;
        this.A07 = r16;
        this.A06 = scrollView;
        this.A0M = r31;
    }
}
