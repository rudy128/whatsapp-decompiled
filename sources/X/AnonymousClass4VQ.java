package X;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.4VQ  reason: invalid class name */
public final class AnonymousClass4VQ {
    public Runnable A00;
    public AnonymousClass1OX A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final View A06;
    public final FrameLayout A07;
    public final FrameLayout A08;
    public final ImageView A09;
    public final TextView A0A;
    public final AnonymousClass1F9 A0B;
    public final AnonymousClass1DT A0C = AnonymousClass3MW.A0L();
    public final AnonymousClass1KB A0D;
    public final C827349n A0E;
    public final AnonymousClass3uL A0F;
    public final ConversationRowVideo$RowVideoView A0G;
    public final AnonymousClass4MQ A0H;
    public final C18000vb A0I;
    public final AnonymousClass18K A0J;
    public final AnonymousClass64H A0K;
    public final AnonymousClass1c4 A0L;
    public final C88634aG A0M;
    public final C136746uK A0N;
    public final AnonymousClass21Y A0O;
    public final Runnable A0P;
    public final C18100vl A0Q;
    public final C18100vl A0R;
    public final C18100vl A0S;
    public final C18600wl A0T;
    public final C18600wl A0U;

    public final void A00() {
        boolean A1T = AnonymousClass3MX.A1T(C17890vO.A0B(this.A0H.A01), "is_last_video_autoplay_mute");
        AnonymousClass1DT r2 = this.A0C;
        Object A062 = r2.A06();
        Boolean valueOf = Boolean.valueOf(A1T);
        if (!C18070vi.A18(A062, valueOf)) {
            r2.A0F(valueOf);
        }
    }

    public final void A02() {
        File file;
        Uri fromFile;
        String path;
        AnonymousClass21Y r5 = this.A0O;
        AnonymousClass205 r4 = r5.A0v;
        hashCode();
        if (r5.A0w() || !((file = AnonymousClass3Ma.A0M(r5).A0G) == null || (fromFile = Uri.fromFile(file)) == null || (path = fromFile.getPath()) == null || !new File(path).exists())) {
            Log.i("ConversationRowVideoAutoPlay/startVideoPlayer");
            C827349n r3 = this.A0E;
            AnonymousClass205 r1 = null;
            AnonymousClass4TS r0 = r3.A00.A03;
            if (r0 != null) {
                r1 = r0.A01.A0v;
            }
            if (!C18070vi.A18(r1, r4) || !r3.A0a()) {
                r3.A0g(r5, 1);
                r3.A0E();
                return;
            }
            return;
        }
        Log.w("ConversationRoVideoAutoPlay/alertVideoFileNotFound/ no file");
        AnonymousClass3uL r32 = this.A0F;
        if (r32.A2p()) {
            return;
        }
        if (r32.A0l.CLq()) {
            AnonymousClass1FU A0O2 = C72473Md.A0O(r32);
            if (A0O2 != null) {
                ((C139956zi) r32.A0O.get()).A03(A0O2);
                return;
            }
            return;
        }
        AnonymousClass3MY.A11(AnonymousClass1LU.A0b(r32.getContext(), r4.A00, r4.hashCode()), r32);
    }

    public final void A01() {
        hashCode();
        C827349n r6 = this.A0E;
        if (((double) r6.A05()) > ((double) r6.A06()) * 0.75d) {
            this.A0P.run();
        }
        r6.A0B();
    }

    public final void A03() {
        hashCode();
        C827349n r6 = this.A0E;
        if (((double) r6.A05()) > ((double) r6.A06()) * 0.75d) {
            this.A0P.run();
        }
        r6.A0F();
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.6uK] */
    public AnonymousClass4VQ(View view, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, TextView textView, AnonymousClass1F9 r27, AnonymousClass1KB r28, AnonymousClass3uL r29, ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView, AnonymousClass4MQ r31, C18000vb r32, C18030ve r33, AnonymousClass18K r34, AnonymousClass1c4 r35, C88634aG r36, AnonymousClass21Y r37, C28931bI r38, C28931bI r39, C86034Px r40, Runnable runnable, C18600wl r42, C18600wl r43) {
        C18030ve r19 = r33;
        C86034Px r1 = r40;
        C18070vi.A0e(r1, 1, r19);
        AnonymousClass1KB r13 = r28;
        C18070vi.A0d(r13, 3);
        C18000vb r14 = r32;
        AnonymousClass4MQ r15 = r31;
        C18070vi.A0g(r14, 4, r15);
        AnonymousClass18K r8 = r34;
        AnonymousClass1c4 r7 = r35;
        C18070vi.A0l(r8, r7);
        C18600wl r5 = r42;
        C18070vi.A0d(r5, 8);
        C18600wl r0 = r43;
        C88634aG r6 = r36;
        C72473Md.A1K(r6, r0);
        AnonymousClass21Y r9 = r37;
        C18070vi.A0d(r9, 17);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView2 = conversationRowVideo$RowVideoView;
        C18070vi.A0d(conversationRowVideo$RowVideoView2, 18);
        this.A0D = r13;
        this.A0I = r14;
        this.A0H = r15;
        this.A0J = r8;
        this.A0L = r7;
        this.A0U = r5;
        this.A0M = r6;
        this.A0T = r0;
        View view2 = view;
        this.A06 = view2;
        TextView textView2 = textView;
        this.A0A = textView2;
        ImageView imageView2 = imageView;
        this.A09 = imageView2;
        FrameLayout frameLayout3 = frameLayout;
        this.A07 = frameLayout3;
        this.A0O = r9;
        this.A0G = conversationRowVideo$RowVideoView2;
        FrameLayout frameLayout4 = frameLayout2;
        this.A08 = frameLayout4;
        this.A0B = r27;
        this.A0F = r29;
        this.A0P = runnable;
        this.A0R = AnonymousClass1DF.A01(new C102385Gg(r38));
        this.A0S = AnonymousClass1DF.A01(new C102395Gh(r39));
        this.A0K = new AnonymousClass64H();
        this.A0N = new Object();
        C827349n r152 = new C827349n(conversationRowVideo$RowVideoView2, frameLayout4, r13, r19, r1);
        this.A0E = r152;
        if (r9.A0w()) {
            this.A0A.setText(C64052u8.A0D(this.A0I, (String) null, (long) this.A0O.A0D));
        }
        r152.A0C = true;
        r152.A0T(new AnonymousClass4r0(this, 1));
        if (r9.A0w()) {
            r152.A01 = new C98354qz(this, 1);
        }
        r152.A0D = true;
        r152.A0P(3);
        FrameLayout frameLayout5 = this.A08;
        frameLayout5.setContentDescription(C17880vN.A0q(frameLayout5.getContext(), C64052u8.A02(this.A0I, this.A0O.A0D, 0), new Object[1], 0, 2131897841));
        if (r9.A0w()) {
            imageView2.setVisibility(4);
            frameLayout3.setVisibility(4);
            C72453Mb.A1U(this.A0R, 4);
            view2.setVisibility(8);
            textView2.setVisibility(0);
        }
        this.A0Q = AnonymousClass1DF.A01(AnonymousClass5Q5.A00);
        this.A00 = new C98784ri((Object) this, 35);
    }
}
