package com.whatsapp.status.playback.fragment;

import X.AnonymousClass000;
import X.AnonymousClass1E5;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass3Ma;
import X.AnonymousClass78A;
import X.AnonymousClass78P;
import X.C124266Xr;
import X.C131096kV;
import X.C17890vO;
import X.C18070vi;
import X.C18600wl;
import X.C22971Dz;
import X.C24921Me;
import X.C27621Wu;
import X.C28931bI;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C37451pZ;
import X.C42141xh;
import X.C72043Kk;
import X.C72453Mb;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$fetchContactAndUpdateUI$1", f = "StatusPlaybackContactFragment.kt", i = {}, l = {772}, m = "invokeSuspend", n = {}, s = {})
public final class StatusPlaybackContactFragment$fetchContactAndUpdateUI$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $contactJidToFetch;
    public int label;
    public final /* synthetic */ StatusPlaybackContactFragment this$0;

    @DebugMetadata(c = "com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$fetchContactAndUpdateUI$1$1", f = "StatusPlaybackContactFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$fetchContactAndUpdateUI$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(A0H, statusPlaybackContactFragment, r5);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            View A02;
            View.OnClickListener r1;
            if (this.label == 0) {
                C30691eM.A01(obj);
                StatusPlaybackContactFragment statusPlaybackContactFragment = statusPlaybackContactFragment;
                AnonymousClass1E7 r4 = A0H;
                C131096kV r2 = statusPlaybackContactFragment.A05;
                if (r2 != null) {
                    ImageView imageView = r2.A0B;
                    ImageView imageView2 = imageView;
                    int i = 0;
                    if (statusPlaybackContactFragment.A12) {
                        C28931bI r0 = r2.A01;
                        if (r0 != null) {
                            View A022 = r0.A02();
                            ((WDSProfilePhoto) A022).setProfileBadge(C124266Xr.A00());
                            C18070vi.A0X(A022);
                            imageView = (ImageView) A022;
                            imageView.setVisibility(0);
                            imageView2.setVisibility(8);
                        } else {
                            throw C17890vO.A0K();
                        }
                    }
                    ((C37451pZ) statusPlaybackContactFragment.A18.getValue()).A07(imageView, r4);
                    C72043Kk r5 = statusPlaybackContactFragment.A05;
                    if (r5 != null) {
                        C42141xh A01 = C42141xh.A01(r2.A09, r5, 2131432903);
                        UserJid userJid = statusPlaybackContactFragment.A0N;
                        AnonymousClass1E5 r6 = AnonymousClass1E5.A00;
                        if (userJid == r6) {
                            TextEmojiLabel textEmojiLabel = A01.A01;
                            textEmojiLabel.setText(2131892379);
                            textEmojiLabel.A0N();
                            statusPlaybackContactFragment.A0u = statusPlaybackContactFragment.A1H(2131898595);
                        } else {
                            C24921Me r02 = statusPlaybackContactFragment.A0B;
                            if (r02 != null) {
                                String A0N = r02.A0N(r4);
                                statusPlaybackContactFragment.A0u = A0N;
                                A01.A0B((List) null, A0N);
                                if (C22971Dz.A0Z(statusPlaybackContactFragment.A0N) || (r4.A0O() && C72453Mb.A1a(statusPlaybackContactFragment.A19))) {
                                    i = 3;
                                }
                                A01.A03(i);
                            } else {
                                str = "waContactNames";
                            }
                        }
                        boolean z = statusPlaybackContactFragment.A12;
                        UserJid userJid2 = statusPlaybackContactFragment.A0N;
                        if (C22971Dz.A0Y(userJid2) && userJid2 != r6) {
                            AnonymousClass3Ma.A1F(r2.A0B, statusPlaybackContactFragment, r2, r4, 48);
                            A02 = r2.A03;
                            r1 = new AnonymousClass78A(statusPlaybackContactFragment, r2, r4, 49);
                        } else if (z) {
                            C28931bI r03 = r2.A01;
                            if (!(r03 == null || (A02 = r03.A02()) == null)) {
                                r1 = new AnonymousClass78P((Object) statusPlaybackContactFragment, 11);
                            }
                        } else {
                            r2.A0B.setClickable(false);
                            r2.A03.setClickable(false);
                        }
                        A02.setOnClickListener(r1);
                    } else {
                        str = "textEmojiLabelViewControllerFactory";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusPlaybackContactFragment$fetchContactAndUpdateUI$1(UserJid userJid, StatusPlaybackContactFragment statusPlaybackContactFragment, C30391dr r4) {
        super(2, r4);
        this.this$0 = statusPlaybackContactFragment;
        this.$contactJidToFetch = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StatusPlaybackContactFragment$fetchContactAndUpdateUI$1(this.$contactJidToFetch, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1M9 r1 = this.this$0.A09;
            if (r1 != null) {
                final AnonymousClass1E7 A0H = r1.A0H(this.$contactJidToFetch);
                final StatusPlaybackContactFragment statusPlaybackContactFragment = this.this$0;
                C18600wl r2 = statusPlaybackContactFragment.A0z;
                if (r2 != null) {
                    AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                    this.label = 1;
                    if (C30451dy.A00(this, r2, r0) == r6) {
                        return r6;
                    }
                } else {
                    str = "mainDispatcher";
                }
            } else {
                str = "contactManager";
            }
            C18070vi.A11(str);
            throw null;
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusPlaybackContactFragment$fetchContactAndUpdateUI$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
