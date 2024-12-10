package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1KW;
import X.AnonymousClass1T1;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass70X;
import X.AnonymousClass73D;
import X.AnonymousClass7AT;
import X.AnonymousClass7JF;
import X.AnonymousClass7JN;
import X.AnonymousClass7JS;
import X.AnonymousClass805;
import X.C108955ca;
import X.C108995ce;
import X.C132516mw;
import X.C136986uj;
import X.C139426yp;
import X.C1405471x;
import X.C1409573s;
import X.C1410073x;
import X.C151577mW;
import X.C151587mX;
import X.C151597mY;
import X.C156107tp;
import X.C156117tq;
import X.C160888Ai;
import X.C17880vN;
import X.C17960vV;
import X.C17970vW;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C25291Nq;
import X.C26451Se;
import X.C26631Sw;
import X.C30391dr;
import X.C41561wd;
import X.C99274sY;
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.mediacomposer.viewmodel.GifComposerViewModel;
import com.whatsapp.mediacomposer.viewmodel.GifComposerViewModel$prepareData$1;
import com.whatsapp.util.Log;
import java.io.File;

public final class GifComposerFragment extends Hilt_GifComposerFragment {
    public AnonymousClass70X A00;
    public AnonymousClass00H A01;
    public C18090vk A02;
    public final C18100vl A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        Log.i("GifComposerFragment/onCreateView");
        int i = 2131625446;
        if (A2U()) {
            i = 2131625447;
        }
        return C108955ca.A0G(layoutInflater, viewGroup, i, false);
    }

    public void A21(Bundle bundle, View view) {
        View A09;
        String str;
        int i;
        float f;
        int i2;
        float f2;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        Log.i("GifComposerFragment/onViewCreated");
        Uri uri = this.A01;
        if (uri != null) {
            C17960vV.A0D(AnonymousClass000.A1X(this.A00));
            C18100vl r2 = this.A03;
            AnonymousClass7AT.A01(A1G(), ((GifComposerViewModel) r2.getValue()).A00, new AnonymousClass805(this), 39);
            C160888Ai A29 = A29();
            Uri uri2 = null;
            if (A29 != null) {
                AnonymousClass73D r7 = ((MediaComposerActivity) A29).A1q;
                File A0C = r7.A02(uri).A0C();
                if (A0C != null) {
                    if (bundle == null) {
                        String A0F = r7.A02(uri).A0F();
                        String BR5 = A29.BR5(uri);
                        if (A0F == null) {
                            try {
                                C1405471x A07 = r7.A02(uri).A07();
                                if (A07 == null) {
                                    AnonymousClass00H r0 = this.A01;
                                    if (r0 != null) {
                                        A07 = ((C132516mw) r0.get()).A00(A0C);
                                    } else {
                                        C18070vi.A11("videoMetaFactory");
                                        throw null;
                                    }
                                }
                                if (A2U()) {
                                    f = 720.0f;
                                    f2 = 1280.0f;
                                } else {
                                    boolean A022 = A07.A02();
                                    if (A022) {
                                        i = A07.A00;
                                    } else {
                                        i = A07.A02;
                                    }
                                    f = (float) i;
                                    if (A022) {
                                        i2 = A07.A02;
                                    } else {
                                        i2 = A07.A00;
                                    }
                                    f2 = (float) i2;
                                }
                                RectF rectF = new RectF(0.0f, 0.0f, f, f2);
                                AnonymousClass7JF r72 = this.A0J;
                                if (r72 != null) {
                                    r72.A0Q.A07 = rectF;
                                    r72.A0P.A00 = 0.0f;
                                    r72.A0C(rectF);
                                }
                            } catch (C26451Se e) {
                                Log.e("GifComposerFragment/bad video", e);
                            }
                        } else {
                            C139426yp r8 = C1409573s.A06;
                            Context A14 = A14();
                            AnonymousClass1KW r12 = this.A0F;
                            if (r12 != null) {
                                C18000vb r11 = this.A0E;
                                if (r11 != null) {
                                    C26631Sw r15 = this.A0Q;
                                    if (r15 != null) {
                                        C18030ve A28 = A28();
                                        AnonymousClass00H r73 = this.A0a;
                                        if (r73 != null) {
                                            C25291Nq r14 = (C25291Nq) C18070vi.A0E(r73);
                                            AnonymousClass1T1 r10 = this.A06;
                                            if (r10 != null) {
                                                C1409573s A023 = r8.A02(A14, r10, r11, r12, A28, r14, r15, A0F);
                                                if (A023 != null) {
                                                    C108995ce.A1D(this, A023, BR5);
                                                }
                                            } else {
                                                str = "doodleFactory";
                                            }
                                        } else {
                                            str = "mediaUtils";
                                        }
                                    } else {
                                        str = "stickerImageFileLoader";
                                    }
                                } else {
                                    AnonymousClass3MW.A1M();
                                    throw null;
                                }
                            } else {
                                str = "emojiLoader";
                            }
                            C18070vi.A11(str);
                            throw null;
                        }
                    }
                    C160888Ai A292 = A29();
                    if (A292 != null) {
                        uri2 = A292.BN2();
                    }
                    if (uri.equals(uri2)) {
                        AnonymousClass70X r02 = this.A00;
                        if (!(r02 == null || (A09 = r02.A09()) == null)) {
                            A09.setAlpha(0.0f);
                        }
                        A1D().A2Z();
                    }
                    GifComposerViewModel gifComposerViewModel = (GifComposerViewModel) r2.getValue();
                    AnonymousClass3MX.A1Q(new GifComposerViewModel$prepareData$1(uri, gifComposerViewModel, A0C, (C30391dr) null), C41561wd.A00(gifComposerViewModel));
                    return;
                }
            }
            throw C17880vN.A0g();
        }
    }

    public void A2I() {
        C18090vk r0 = this.A02;
        if (r0 != null) {
            r0.invoke();
        }
        this.A02 = null;
        super.A2I();
    }

    public void A2K() {
        Boolean bool = C17970vW.A03;
        AnonymousClass70X r0 = this.A00;
        if (r0 != null) {
            r0.A0E();
            r0.A09().setKeepScreenOn(true);
        }
        AnonymousClass7JF r02 = this.A0J;
        if (r02 != null) {
            C1410073x.A02(r02.A0P);
        }
    }

    public GifComposerFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C151587mX(new C151577mW(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(GifComposerViewModel.class);
        this.A03 = C99274sY.A00(new C151597mY(A002), new C156117tq(this, A002), new C156107tp(A002), A15);
    }

    public void A1s() {
        super.A1s();
        AnonymousClass70X r0 = this.A00;
        if (r0 != null) {
            r0.A0F();
        }
        this.A00 = null;
    }

    public void A2C() {
        super.A2C();
        A2T();
    }

    public void A2F() {
        super.A2F();
        AnonymousClass70X r0 = this.A00;
        if (r0 != null) {
            r0.A0E();
        }
    }

    public void A2G() {
        super.A2G();
        AnonymousClass70X r0 = this.A00;
        if (r0 != null) {
            r0.A0B();
        }
    }

    public void A2P(AnonymousClass7JS r3, AnonymousClass7JN r4, C136986uj r5) {
        C18070vi.A0n(r5, r4, r3);
        super.A2P(r3, r4, r5);
        r5.A0I.setCropToolVisibility(8);
        r4.A05();
        AnonymousClass7JN.A02(r4);
        A2K();
    }
}
