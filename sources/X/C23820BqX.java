package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BqX  reason: case insensitive filesystem */
public class C23820BqX extends C23811BqM {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public final ConversationRowAudioPreview A02;
    public final C134196qC A03;
    public final AudioPlayerView A04;
    public final TextView A05;
    public final C31131f4 A06;
    public final View.OnClickListener A07 = new C89904dD(this, 24);
    public final View A08;

    private void A04() {
        C441822l r4 = (C441822l) ((AnonymousClass21V) this.A0I);
        C31131f4 r1 = this.A06;
        if (!r1.A0D(r4)) {
            A0A(r4);
            return;
        }
        C145777Mo A002 = r1.A00();
        if (A002 != null) {
            if (!A002.A0I()) {
                A0A(r4);
            } else {
                AudioPlayerView audioPlayerView = this.A04;
                audioPlayerView.setPlayButtonState(1);
                audioPlayerView.setSeekbarMax((int) TimeUnit.SECONDS.toMillis((long) r4.A0D));
                audioPlayerView.setSeekbarProgress(A002.A09());
                setDuration(BE7.A0j(this.A0D, A002.A09() / 1000));
                ConversationRowAudioPreview conversationRowAudioPreview = this.A02;
                if (conversationRowAudioPreview != null) {
                    BEA.A1B(conversationRowAudioPreview);
                }
            }
            AudioPlayerView audioPlayerView2 = this.A04;
            audioPlayerView2.setSeekbarContentDescription((long) A002.A09());
            A002.A0I = new DP0(this, 0);
            A002.A0H = new C23827Bqk(this.A02, new DP1(this, 0), new DP2(this, 0), audioPlayerView2, this, A002, 0);
        }
    }

    private void A03() {
        C38471rL r0;
        String A0j;
        C441822l r8 = (C441822l) ((AnonymousClass21V) this.A0I);
        C62572rc r1 = r8.A02;
        C17960vV.A07(r1);
        String A022 = AnonymousClass72W.A02(getContext(), this.A0j, this.A0l, this.A0u, this.A0D, r8);
        if (r8.A0w()) {
            C46162Dk r3 = (C46162Dk) this.A0E.A0A(r8.A0v.A00);
            AnonymousClass11P r7 = this.A0u;
            C18000vb r6 = this.A0D;
            AnonymousClass1c4 r2 = (AnonymousClass1c4) this.A2B.get();
            AnonymousClass4XM r4 = (AnonymousClass4XM) this.A2E.get();
            if (r3 != null && r8.A0w() && AnonymousClass4aS.A0A(r3, r2)) {
                int indexOf = A022.indexOf(A8I.A00(r6, r7.A09(r8.A0I)));
                String A032 = AnonymousClass4aS.A03(r6, r4, r8);
                StringBuilder A0u = BE6.A0u(A022);
                int i = indexOf - 1;
                StringBuilder A10 = AnonymousClass000.A10();
                BE6.A1J(A10);
                AnonymousClass8BT.A1V(A10, A032);
                A0u.insert(i, A10.toString());
                A022 = A0u.toString();
            }
        }
        this.A08.setContentDescription(A022);
        TextView textView = this.A05;
        textView.setVisibility(0);
        if (r8.A0D == 0) {
            r8.A0D = C26511Sk.A03(r1.A0G);
        }
        if (AnonymousClass25A.A11(getFMessage())) {
            ConversationRowAudioPreview conversationRowAudioPreview = this.A02;
            if (conversationRowAudioPreview != null) {
                conversationRowAudioPreview.A01();
            }
            textView.setText(C88584aA.A02(this.A0D, r8.A01));
            AudioPlayerView audioPlayerView = this.A04;
            audioPlayerView.setPlayButtonState(4);
            audioPlayerView.setOnControlButtonClickListener(this.A0C);
            audioPlayerView.setSeekbarProgress(0);
        } else if (C79103uS.A1L(this)) {
            BEB.A13(r1, r8);
            if (AnonymousClass1EG.A0H(r8.A19())) {
                textView.setVisibility(8);
            } else {
                textView.setText(r8.A19());
            }
            AudioPlayerView audioPlayerView2 = this.A04;
            audioPlayerView2.setSeekbarColor(C19740yt.A00(getContext(), 2131101947));
            A04();
            audioPlayerView2.setOnControlButtonClickListener(this.A07);
            if (A2s(r8)) {
                A1s();
            }
            A1y();
            A2n(r8);
            A2P(r8);
            A2N(r8);
        } else {
            ConversationRowAudioPreview conversationRowAudioPreview2 = this.A02;
            if (conversationRowAudioPreview2 != null) {
                conversationRowAudioPreview2.A01();
            }
            textView.setText(C88584aA.A02(this.A0D, r8.A01));
            boolean A002 = AnonymousClass4H3.A00(r8);
            AudioPlayerView audioPlayerView3 = this.A04;
            if (!A002) {
                audioPlayerView3.setPlayButtonState(2);
                r0 = this.A0E;
            } else {
                audioPlayerView3.setPlayButtonState(3);
                r0 = this.A0D;
            }
            audioPlayerView3.setOnControlButtonClickListener(r0);
            if (r8.A0D != 0) {
                A0j = BE7.A0j(this.A0D, r8.A0D);
                setDuration(A0j);
                A1y();
                A2n(r8);
                A2P(r8);
                A2N(r8);
            }
        }
        A0j = C88584aA.A02(this.A0D, r8.A01);
        setDuration(A0j);
        A1y();
        A2n(r8);
        A2P(r8);
        A2N(r8);
    }

    private void A0A(C441822l r4) {
        int intValue;
        Number A1D = C108945cZ.A1D(r4.A0v, C145777Mo.A17);
        if (A1D == null) {
            intValue = 0;
        } else {
            intValue = A1D.intValue();
        }
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(r4.A0D * 1000);
        audioPlayerView.setSeekbarProgress(intValue);
        audioPlayerView.setSeekbarContentDescription((long) intValue);
        setDuration(BE7.A0j(this.A0D, r4.A0D));
        ConversationRowAudioPreview conversationRowAudioPreview = this.A02;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A01();
        }
    }

    public boolean A1V() {
        if (!((C32911hx) this.A1y.get()).A01(this.A0I) || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public boolean A1X() {
        return C79103uS.A1K(this, this.A0I, this.A1h);
    }

    public boolean A1Z() {
        return AnonymousClass25A.A0W(this.A0E, this.A0I, this.A2O);
    }

    public void A1y() {
        C28931bI progressBar = this.A04.getProgressBar();
        C32861hs r0 = this.A05;
        C17960vV.A07(r0);
        C88564a8.A01(r0, (AnonymousClass21V) this.A0I, progressBar);
    }

    public void A20() {
        C31131f4 r2 = this.A06;
        AnonymousClass00H r1 = this.A00;
        View rootView = this.A08.getRootView();
        boolean A1U = AnonymousClass8BX.A1U(r2, r1, rootView);
        AnonymousClass4aV.A03(rootView, r2, r1);
        if (this.A03 == null || AnonymousClass74O.A0P(getContext(), this.A03)) {
            C441822l r3 = (C441822l) ((AnonymousClass21V) this.A0I);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("conversationrowvoicenote/viewmessage ");
            C17900vP.A0b(r3.A0v, A10);
            if (A2t(r3)) {
                C145777Mo A002 = this.A03.A00(AnonymousClass3Ma.A05(this), r3, false);
                A002.A0D(r3);
                A002.A0I = new DP0(this, 0);
                if (r3.A0u == 82) {
                    A002.A0G(A1U);
                } else {
                    A002.A0G(false);
                }
                A1u();
            }
        }
    }

    public void A2I(AnonymousClass1BI r7) {
        boolean equals;
        C20947Ac1 A002;
        ImageView imageView;
        if (this instanceof C23819BqW) {
            C23819BqW bqW = (C23819BqW) this;
            C441822l r5 = (C441822l) ((AnonymousClass21V) bqW.A0I);
            C18070vi.A0X(r5);
            AnonymousClass205 r1 = r5.A0v;
            if (!r1.A02 && !r5.A1J()) {
                AnonymousClass1BI r3 = r1.A00;
                boolean A0e = C22971Dz.A0e(r3);
                if (A0e) {
                    r3 = r5.A0H();
                }
                if (C18070vi.A18(r7, r3)) {
                    if (A0e) {
                        imageView = bqW.A0G;
                    } else {
                        imageView = bqW.A0H;
                    }
                    bqW.A0I.A07(imageView, bqW.A0j.A0H(r3));
                }
            }
            if (AnonymousClass9RY.A00(r5) != null && (A002 = AnonymousClass9RY.A00(r5)) != null) {
                C29681ch r12 = A002.A01;
                bqW.A0I.A07(bqW.A0H, bqW.A0j.A0H(r12));
                return;
            }
            return;
        }
        AnonymousClass206 r13 = this.A0I;
        if (r13.A0v.A02) {
            equals = this.A0U.A0O(r7);
        } else {
            equals = r7.equals(r13.A0I());
        }
        if (equals) {
            A1t();
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A03();
        } else if (C79103uS.A1L(this)) {
            A04();
            if (A2s(r2)) {
                A1s();
            }
        }
    }

    public C441822l getFMessage() {
        return (C441822l) ((AnonymousClass21V) this.A0I);
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(this.A0I)) {
            return 0;
        }
        return getResources().getDimensionPixelSize(2131166243);
    }

    public void setDuration(String str) {
        ConversationRowAudioPreview conversationRowAudioPreview = this.A02;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.setDuration(str);
        }
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C441822l);
        super.setFMessage(r2);
    }

    public C23820BqX(Context context, C108875cR r9, C134196qC r10, C31131f4 r11, C441822l r12) {
        super(context, r9, r12);
        A1M();
        this.A03 = r10;
        this.A06 = r11;
        this.A08 = findViewById(2131432248);
        AudioPlayerView audioPlayerView = (AudioPlayerView) AnonymousClass1HF.A06(this, 2131429586);
        this.A04 = audioPlayerView;
        this.A02 = (ConversationRowAudioPreview) findViewById(2131429587);
        this.A05 = AnonymousClass3MW.A0J(this, 2131429927);
        audioPlayerView.setPlaybackListener(new AnonymousClass79X(r11, audioPlayerView, new C27043DQo(this, 0), new C24132Bvy(this, 0), this.A01));
        View.OnLongClickListener onLongClickListener = this.A2t;
        audioPlayerView.setSeekbarLongClickListener(onLongClickListener);
        audioPlayerView.setOnControlButtonLongClickListener(onLongClickListener);
        A03();
        int BXk = ((AnonymousClass8AF) this.A01.get()).BXk(r12.A0x);
        if (BXk >= 0) {
            audioPlayerView.setSeekbarProgress(BXk);
        }
    }

    public static void A05(AnonymousClass10E r1, AnonymousClass10G r2, C27691Xc r3, C23819BqW bqW) {
        bqW.A00 = C000200d.A00(r2.A3f);
        bqW.A01 = C000200d.A00(r2.A41);
        bqW.A06 = C000200d.A00(r2.A9c);
        bqW.A05 = (C28537E6l) r3.A07.get();
        bqW.A07 = C000200d.A00(r1.A9G);
        bqW.A08 = C000200d.A00(r2.AGX);
        bqW.A09 = C000200d.A00(r1.AAz);
        bqW.A01 = (C28470E2l) r3.A08.get();
    }

    public boolean A1Y() {
        return A1f();
    }

    public void A1u() {
        super.A1u();
        A03();
    }

    public boolean A2t(C441822l r9) {
        Context context = getContext();
        Object obj = this.A0O.get();
        C17960vV.A07(obj);
        C139956zi r4 = (C139956zi) obj;
        AnonymousClass1KB r7 = this.A0S;
        C32021gV r6 = this.A1S;
        C62572rc r3 = r9.A02;
        C17960vV.A07(r3);
        int A002 = AnonymousClass72W.A00(r9);
        if (A002 == 0) {
            return false;
        }
        if (A002 == 1) {
            r7.A06(2131890636, 1);
            return false;
        } else if (A002 != 2) {
            return true;
        } else {
            File A17 = C108945cZ.A17(Uri.fromFile(r3.A0G).getPath());
            if (A17.exists() && A17.canRead()) {
                return true;
            }
            if (C88564a8.A04(r9, r6)) {
                A1u();
                return false;
            }
            AnonymousClass1FU r0 = (AnonymousClass1FU) C18050vg.A01(context, AnonymousClass1FU.class);
            if (r0 == null) {
                return false;
            }
            r4.A03(r0);
            return false;
        }
    }

    public int getCenteredLayoutId() {
        return 2131624769;
    }

    public int getIncomingLayoutId() {
        return 2131624769;
    }

    public int getOutgoingLayoutId() {
        return 2131624771;
    }
}
