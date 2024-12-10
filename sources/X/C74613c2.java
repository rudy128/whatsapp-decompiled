package X;

import android.view.animation.Animation;

/* renamed from: X.3c2  reason: invalid class name and case insensitive filesystem */
public class C74613c2 extends C90704eV {
    public final int A00;
    public final Object A01;

    public C74613c2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animation animation, Object obj, int i) {
        animation.setAnimationListener(new C74613c2(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        r1.A0E = false;
        r1.setEnabled(true);
        X.C72473Md.A0y(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.view.animation.Animation r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00a3;
                case 3: goto L_0x00c3;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x003b;
                case 7: goto L_0x0009;
                case 8: goto L_0x0090;
                case 9: goto L_0x0079;
                case 10: goto L_0x006d;
                case 11: goto L_0x0061;
                case 12: goto L_0x0061;
                case 13: goto L_0x0059;
                case 14: goto L_0x0052;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r5)
        L_0x0008:
            return
        L_0x0009:
            java.lang.String r0 = "conversation/showinputextension/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r4.A01
            X.4eD r3 = (X.C90524eD) r3
            X.4aY r2 = r3.A03
            com.whatsapp.KeyboardPopupLayout r1 = r2.A1M
            r0 = 1
            r1.setClipChildren(r0)
            r0 = 0
            r2.A06 = r0
            com.whatsapp.conversation.ConversationListView r1 = r2.A2B
            int r0 = r3.A00
            r1.setTranscriptMode(r0)
            android.view.ViewGroup r1 = r3.A02
            android.view.ViewGroup r0 = r2.A0V
            if (r1 != r0) goto L_0x0008
            X.4Ok r0 = r2.A2I
            if (r0 == 0) goto L_0x0008
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A04
            android.view.ViewGroup r1 = r0.A03
            android.animation.LayoutTransition r0 = new android.animation.LayoutTransition
            r0.<init>()
            r1.setLayoutTransition(r0)
            return
        L_0x003b:
            java.lang.Object r0 = r4.A01
            X.48E r0 = (X.AnonymousClass48E) r0
            java.lang.Object r2 = r0.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            android.widget.ImageButton r0 = r2.A0X
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageButton r0 = r2.A0Y
            if (r0 == 0) goto L_0x0008
            r0.setVisibility(r1)
            return
        L_0x0052:
            java.lang.Object r0 = r4.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = (com.whatsapp.webpagepreview.WebPagePreviewView) r0
            android.widget.LinearLayout r0 = r0.A08
            goto L_0x00bf
        L_0x0059:
            java.lang.Object r0 = r4.A01
            X.0vk r0 = (X.C18090vk) r0
            r0.invoke()
            return
        L_0x0061:
            java.lang.Object r0 = r4.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1GP r0 = r0.A1F()
            r0.A0c()
            return
        L_0x006d:
            java.lang.Object r0 = r4.A01
            X.4eR r0 = (X.C90664eR) r0
            java.lang.Object r1 = r0.A01
            X.3Zj r1 = (X.C74323Zj) r1
            r1.clearAnimation()
            goto L_0x0085
        L_0x0079:
            java.lang.Object r1 = r4.A01
            X.3Zj r1 = (X.C74323Zj) r1
            r1.clearAnimation()
            r0 = 8
            r1.setVisibility(r0)
        L_0x0085:
            r0 = 0
            r1.A0E = r0
            r0 = 1
            r1.setEnabled(r0)
            X.C72473Md.A0y(r1)
            return
        L_0x0090:
            java.lang.Object r0 = r4.A01
            X.4e5 r0 = (X.C90444e5) r0
            java.lang.Object r2 = r0.A03
            android.view.View r2 = (android.view.View) r2
            r1 = 38
            X.4ra r0 = new X.4ra
            r0.<init>(r4, r2, r1)
            r2.post(r0)
            return
        L_0x00a3:
            java.lang.Object r2 = r4.A01
            X.3hU r2 = (X.C75433hU) r2
            com.whatsapp.TextEmojiLabel r0 = r2.A0A()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x00b4
            r0 = -2
            r1.width = r0
        L_0x00b4:
            com.whatsapp.TextEmojiLabel r0 = r2.A0A()
            r0.setLayoutParams(r1)
            com.whatsapp.TextEmojiLabel r0 = r2.A0A()
        L_0x00bf:
            r0.clearAnimation()
            return
        L_0x00c3:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74613c2.onAnimationEnd(android.view.animation.Animation):void");
    }

    public void onAnimationRepeat(Animation animation) {
        switch (this.A00) {
            case 0:
                onAnimationStart(animation);
                return;
            case 5:
                animation.setStartOffset(300);
                return;
            default:
                super.onAnimationRepeat(animation);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        r1.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        ((android.view.View) r1).setEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationStart(android.view.animation.Animation r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x002e;
                case 4: goto L_0x0020;
                case 9: goto L_0x0017;
                case 10: goto L_0x0010;
                case 14: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationStart(r5)
            return
        L_0x0009:
            java.lang.Object r0 = r4.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = (com.whatsapp.webpagepreview.WebPagePreviewView) r0
            android.widget.LinearLayout r1 = r0.A08
            goto L_0x0029
        L_0x0010:
            java.lang.Object r0 = r4.A01
            X.4eR r0 = (X.C90664eR) r0
            java.lang.Object r1 = r0.A01
            goto L_0x0019
        L_0x0017:
            java.lang.Object r1 = r4.A01
        L_0x0019:
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setEnabled(r0)
            return
        L_0x0020:
            java.lang.Object r0 = r4.A01
            X.3ry r0 = (X.C78013ry) r0
            android.view.View r1 = r0.A00
            X.C17960vV.A05(r1)
        L_0x0029:
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x002e:
            java.lang.Object r3 = r4.A01
            X.3mi r3 = (X.C76173mi) r3
            android.view.View r2 = r3.A02
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r0 = 1056964608(0x3f000000, float:0.5)
            X.C76173mi.A00(r2, r1, r0)
            android.widget.ImageView r2 = r3.A03
            r1 = 1048576000(0x3e800000, float:0.25)
            r0 = 1061158912(0x3f400000, float:0.75)
            X.C76173mi.A00(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74613c2.onAnimationStart(android.view.animation.Animation):void");
    }
}
