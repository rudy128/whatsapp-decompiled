package com.whatsapp.conversation;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass122;
import X.AnonymousClass126;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1Y5;
import X.AnonymousClass206;
import X.AnonymousClass27u;
import X.AnonymousClass2XS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3VA;
import X.AnonymousClass3VQ;
import X.AnonymousClass3WO;
import X.AnonymousClass3XZ;
import X.AnonymousClass48B;
import X.AnonymousClass4K6;
import X.AnonymousClass4RR;
import X.AnonymousClass5G0;
import X.AnonymousClass5G1;
import X.AnonymousClass5G2;
import X.AnonymousClass5G3;
import X.AnonymousClass5G4;
import X.AnonymousClass5G5;
import X.AnonymousClass5G6;
import X.AnonymousClass5N5;
import X.BM2;
import X.C102295Fx;
import X.C102305Fy;
import X.C102315Fz;
import X.C108645c3;
import X.C146497Pi;
import X.C155607t1;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C19830z4;
import X.C24071It;
import X.C24751Ln;
import X.C25181Nf;
import X.C27183DXs;
import X.C27201Vd;
import X.C30391dr;
import X.C32551hN;
import X.C36401np;
import X.C37451pZ;
import X.C37581pm;
import X.C37981qV;
import X.C39351sv;
import X.C43531zx;
import X.C74743cP;
import X.C77923ro;
import X.C827249m;
import X.C88604aC;
import X.C90004dN;
import X.C90294dq;
import X.C92214gw;
import X.C99274sY;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;

public final class CommentsBottomSheet extends Hilt_CommentsBottomSheet {
    public AnonymousClass2XS A00;
    public AnonymousClass4K6 A01;
    public AnonymousClass1KB A02;
    public AnonymousClass11S A03;
    public AnonymousClass1M9 A04;
    public C27201Vd A05;
    public AnonymousClass3WO A06;
    public AnonymousClass11C A07;
    public AnonymousClass11P A08;
    public C19830z4 A09;
    public C18000vb A0A;
    public C25181Nf A0B;
    public AnonymousClass122 A0C;
    public C24751Ln A0D;
    public AnonymousClass1L2 A0E;
    public AnonymousClass1KW A0F;
    public C18030ve A0G;
    public AnonymousClass126 A0H;
    public C18010vc A0I;
    public C32551hN A0J;
    public C36401np A0K;
    public AnonymousClass10I A0L;
    public C108645c3 A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public C18600wl A0Q;
    public C18600wl A0R;
    public AnonymousClass3VQ A0S;
    public final C37981qV A0T = new C37981qV();
    public final C18100vl A0U;
    public final C18100vl A0V;
    public final C18100vl A0W;
    public final C18100vl A0X;
    public final C18100vl A0Y;
    public final C18100vl A0Z;
    public final C18100vl A0a;
    public final C18100vl A0b;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624564, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C27201Vd r2 = this.A05;
        if (r2 != null) {
            C37451pZ A042 = r2.A04(A14(), this, "comments-contact-picture");
            AnonymousClass00H r0 = this.A0N;
            if (r0 != null) {
                AnonymousClass4RR r22 = (AnonymousClass4RR) C18070vi.A0E(r0);
                AnonymousClass00H r1 = this.A0O;
                if (r1 != null) {
                    this.A06 = new AnonymousClass3WO(A042, r22, r1);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A1n());
                    linearLayoutManager.A1Z(1);
                    linearLayoutManager.A1d(true);
                    linearLayoutManager.A1e(true);
                    C18100vl r9 = this.A0Z;
                    ((RecyclerView) r9.getValue()).setLayoutManager(linearLayoutManager);
                    RecyclerView recyclerView = (RecyclerView) r9.getValue();
                    AnonymousClass3WO r12 = this.A06;
                    if (r12 != null) {
                        recyclerView.setAdapter(r12);
                        RecyclerView recyclerView2 = (RecyclerView) r9.getValue();
                        RecyclerView recyclerView3 = (RecyclerView) r9.getValue();
                        AnonymousClass3WO r4 = this.A06;
                        if (r4 != null) {
                            recyclerView2.A0r(new BM2(A1n(), recyclerView3, new C92214gw(), r4));
                            ((RecyclerView) r9.getValue()).A0t(new AnonymousClass3XZ(linearLayoutManager, this));
                            C18100vl r5 = this.A0W;
                            C27183DXs dXs = new C27183DXs((AnonymousClass1OS) new CommentsBottomSheet$setupRecyclerView$3(linearLayoutManager, (C30391dr) null), ((AnonymousClass3VA) r5.getValue()).A0O, 10);
                            C18600wl r02 = this.A0R;
                            if (r02 != null) {
                                C88604aC.A03(AnonymousClass1OW.A02(r02), dXs);
                                C27183DXs dXs2 = new C27183DXs((AnonymousClass1OS) new CommentsBottomSheet$setupRecyclerView$4(this, (C30391dr) null), ((AnonymousClass3VA) r5.getValue()).A0M, 10);
                                C37581pm A0H2 = AnonymousClass3MZ.A0H(this);
                                C18600wl r03 = this.A0R;
                                if (r03 != null) {
                                    C88604aC.A03(AnonymousClass1OW.A03(r03, A0H2), dXs2);
                                    C18070vi.A05(view, 2131430328).setVisibility(8);
                                    C77923ro r6 = (C77923ro) C18070vi.A05(view, 2131430490);
                                    r6.setOnTouchListener(new C90294dq(0));
                                    C43531zx.A03(r6, new C39351sv(AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168777), 0, AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168777), 0));
                                    r6.setHint(2131888480);
                                    ImageView A0C2 = AnonymousClass3Ma.A0C(view, 2131435142);
                                    C18000vb r23 = this.A0A;
                                    if (r23 != null) {
                                        C74743cP.A03(AnonymousClass3MX.A06(A0C2.getContext(), 2131232506), A0C2, r23);
                                        r6.addTextChangedListener(new AnonymousClass48B(this, r6, 0));
                                        C90004dN.A00(A0C2, this, r6, 39);
                                        r6.setupEnterIsSend(new C146497Pi(this, r6, 24));
                                        r6.setInputType(147457);
                                        AnonymousClass3Ma.A1B(AnonymousClass3MW.A0A(this.A0V), this, 47);
                                        AnonymousClass1Y5.A0A(AnonymousClass3MW.A0A(this.A0b), true);
                                        AnonymousClass3MX.A1Q(new CommentsBottomSheet$onViewCreated$1(view, this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                                        C27183DXs dXs3 = new C27183DXs((AnonymousClass1OS) new CommentsBottomSheet$onViewCreated$2(this, (C30391dr) null), ((AnonymousClass3VA) r5.getValue()).A0N, 10);
                                        C37581pm A0H3 = AnonymousClass3MZ.A0H(this);
                                        C18600wl r04 = this.A0R;
                                        if (r04 != null) {
                                            C88604aC.A03(AnonymousClass1OW.A03(r04, A0H3), dXs3);
                                            C27183DXs dXs4 = new C27183DXs((AnonymousClass1OS) new CommentsBottomSheet$onViewCreated$3(this, (C30391dr) null), ((AnonymousClass3VA) r5.getValue()).A0P, 10);
                                            C37581pm A0H4 = AnonymousClass3MZ.A0H(this);
                                            C18600wl r05 = this.A0R;
                                            if (r05 != null) {
                                                C88604aC.A03(AnonymousClass1OW.A03(r05, A0H4), dXs4);
                                                return;
                                            } else {
                                                AnonymousClass3MW.A1L();
                                                throw null;
                                            }
                                        } else {
                                            AnonymousClass3MW.A1L();
                                            throw null;
                                        }
                                    } else {
                                        str = "whatsAppLocale";
                                    }
                                } else {
                                    AnonymousClass3MW.A1L();
                                    throw null;
                                }
                            } else {
                                AnonymousClass3MW.A1L();
                                throw null;
                            }
                        }
                    }
                    C18070vi.A11("adapter");
                    throw null;
                }
                str = "bubbleResolver";
            } else {
                str = "asyncLinkifierLazy";
            }
        } else {
            str = "contactPhotos";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        AnonymousClass3VQ r0 = this.A0S;
        if (r0 == null) {
            C18070vi.A11("messagesViewModel");
            throw null;
        } else {
            r0.A0a((AnonymousClass206) null);
        }
    }

    public void A1r() {
        AnonymousClass00H r0 = this.A0N;
        if (r0 != null) {
            AnonymousClass4RR r2 = (AnonymousClass4RR) r0.get();
            C827249m r1 = r2.A00;
            if (r1 != null) {
                r1.A02 = true;
                r1.interrupt();
                r2.A00 = null;
            }
            super.A1r();
            return;
        }
        C18070vi.A11("asyncLinkifierLazy");
        throw null;
    }

    public CommentsBottomSheet() {
        Integer num = AnonymousClass00R.A0C;
        this.A0U = AnonymousClass1DF.A00(num, new AnonymousClass5N5(this));
        this.A0Y = AnonymousClass1DF.A01(new AnonymousClass5G0(this));
        C102305Fy r4 = new C102305Fy(this);
        C18100vl A002 = AnonymousClass1DF.A00(num, new AnonymousClass5G4(new AnonymousClass5G3(this)));
        this.A0W = C99274sY.A00(new AnonymousClass5G5(A002), r4, new C155607t1(A002), AnonymousClass3MW.A15(AnonymousClass3VA.class));
        this.A0X = AnonymousClass1DF.A01(new C102315Fz(this));
        this.A0a = AnonymousClass1DF.A01(new AnonymousClass5G2(this));
        this.A0Z = AnonymousClass1DF.A01(new AnonymousClass5G1(this));
        this.A0b = AnonymousClass1DF.A01(new AnonymousClass5G6(this));
        this.A0V = AnonymousClass1DF.A01(new C102295Fx(this));
    }

    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) AnonymousClass3Ma.A0I(this).A00(MessageSelectionViewModel.class);
        C25181Nf r2 = this.A0B;
        if (r2 != null) {
            C18100vl r1 = this.A0U;
            AnonymousClass1E7 A012 = r2.A01(AnonymousClass3MX.A0m(r1));
            AnonymousClass1FL A1D = A1D();
            AnonymousClass2XS r6 = this.A00;
            if (r6 != null) {
                AnonymousClass1FL A1D2 = A1D();
                C108645c3 r10 = this.A0M;
                if (r10 != null) {
                    this.A0S = (AnonymousClass3VQ) new C24071It(new AnonymousClass27u(A1D().getIntent(), A1D2, r6, messageSelectionViewModel, A012, AnonymousClass3MX.A0m(r1), r10), A1D).A00(AnonymousClass3VQ.class);
                    return;
                }
                str = "inlineVideoPlaybackHandler";
            } else {
                str = "messagesViewModelFactory";
            }
        } else {
            str = "conversationContactManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public int A25() {
        return 2132083615;
    }
}
