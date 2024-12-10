package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1E7;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72463Mc;
import X.C88084Yg;
import X.C88604aC;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1$1$5", f = "DialerActivity.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
public final class DialerActivity$initObservables$1$1$1$5 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ DialerViewModel $this_with;
    public int label;
    public final /* synthetic */ DialerActivity this$0;

    @DebugMetadata(c = "com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1$1$5$1", f = "DialerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.dialer.DialerActivity$initObservables$1$1$1$5$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Drawable drawable;
            ImageView imageView;
            int i;
            if (this.label == 0) {
                C30691eM.A01(obj);
                C88084Yg r5 = (C88084Yg) this.L$0;
                DialerActivity dialerActivity = DialerActivity.this;
                ArrayList arrayList = DialerActivity.A0I;
                if (!C18070vi.A18(r5.A06, AnonymousClass3MZ.A0X(dialerActivity).A0H.getValue()) || (str = r5.A05) == null || str.length() == 0) {
                    DialerActivity.A0c(dialerActivity, r5.A09);
                } else {
                    ShimmerFrameLayout shimmerFrameLayout = dialerActivity.A06;
                    if (shimmerFrameLayout != null) {
                        shimmerFrameLayout.A01();
                        ShimmerFrameLayout shimmerFrameLayout2 = dialerActivity.A06;
                        if (shimmerFrameLayout2 != null) {
                            shimmerFrameLayout2.setVisibility(8);
                            TextEmojiLabel textEmojiLabel = dialerActivity.A07;
                            if (textEmojiLabel == null) {
                                C18070vi.A11("numberDetailsTextView");
                                throw null;
                            }
                            textEmojiLabel.A0N();
                            textEmojiLabel.setText(str);
                            AnonymousClass1D6 r0 = r5.A07;
                            if (r0 != null) {
                                C72463Mc.A0y(dialerActivity, textEmojiLabel, AnonymousClass3MZ.A04(r0), AnonymousClass000.A0M(r0.second));
                            }
                            textEmojiLabel.setVisibility(0);
                            Integer num = r5.A02;
                            if (num != null) {
                                drawable = AnonymousClass3MZ.A0B(textEmojiLabel, num.intValue());
                            } else {
                                drawable = null;
                            }
                            Drawable drawable2 = r5.A00;
                            if (AnonymousClass3MW.A1Z(textEmojiLabel.getWhatsAppLocale())) {
                                textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
                            } else {
                                textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
                            }
                            textEmojiLabel.setCompoundDrawablePadding(AnonymousClass3Ma.A02(textEmojiLabel, 2131168774));
                            AnonymousClass1E7 r02 = r5.A01;
                            if (r02 == null || !r02.A10) {
                                ImageView imageView2 = dialerActivity.A05;
                                if (imageView2 == null) {
                                    C18070vi.A11("messageNumberButton");
                                    throw null;
                                }
                                AnonymousClass1Y5.A02(imageView2, 2131889411);
                                imageView = dialerActivity.A03;
                                if (imageView == null) {
                                    C18070vi.A11("callButton");
                                    throw null;
                                }
                                i = 2131889405;
                            } else {
                                ImageView imageView3 = dialerActivity.A05;
                                if (imageView3 == null) {
                                    C18070vi.A11("messageNumberButton");
                                    throw null;
                                }
                                AnonymousClass1Y5.A02(imageView3, 2131889412);
                                imageView = dialerActivity.A03;
                                if (imageView == null) {
                                    C18070vi.A11("callButton");
                                    throw null;
                                }
                                i = 2131889406;
                            }
                            AnonymousClass1Y5.A02(imageView, i);
                            String str2 = r5.A03;
                            if (str2 == null) {
                                str2 = "";
                            }
                            textEmojiLabel.setContentDescription(str2);
                        }
                    }
                    C18070vi.A11("numberDetailsShimmer");
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
    public DialerActivity$initObservables$1$1$1$5(DialerActivity dialerActivity, DialerViewModel dialerViewModel, C30391dr r4) {
        super(2, r4);
        this.$this_with = dialerViewModel;
        this.this$0 = dialerActivity;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new DialerActivity$initObservables$1$1$1$5(this.this$0, this.$this_with, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G1 r3 = this.$this_with.A0K;
            final DialerActivity dialerActivity = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C88604aC.A00(this, r0, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DialerActivity$initObservables$1$1$1$5) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
