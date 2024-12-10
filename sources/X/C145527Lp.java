package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.status.messageregistration.FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1;
import java.lang.ref.WeakReference;

/* renamed from: X.7Lp  reason: invalid class name and case insensitive filesystem */
public abstract class C145527Lp implements C437220r {
    public final boolean BgC(AnonymousClass206 r2) {
        return true;
    }

    public void CFF(View view, AnonymousClass724 r10, AnonymousClass206 r11) {
        AnonymousClass206 r3 = r11;
        if (this instanceof C120646Es) {
            C120646Es r4 = (C120646Es) this;
            boolean A16 = C18070vi.A16(r11, view);
            C18070vi.A0d(r10, 3);
            if (r11.A0u == 103) {
                AnonymousClass206 A0K = r11.A0K();
                if (A0K == null) {
                    WeakReference A0z = AnonymousClass3MW.A0z(view);
                    WeakReference A0z2 = AnonymousClass3MW.A0z(r10);
                    AnonymousClass3MW.A1X(r4.A02, new FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1(r3, r4, A0z, A0z2, (C30391dr) null), r4.A04);
                    return;
                }
                r10.A03(view, A0K, A16);
            }
        } else if (this instanceof AnonymousClass2N6) {
            C18070vi.A0d(r11, 0);
            C72473Md.A1I(view, r10);
            if (r11 instanceof AnonymousClass21D) {
                C136606u5 A00 = AnonymousClass6WB.A00(view);
                Context context = view.getContext();
                SpannableStringBuilder A0J = r10.A0D.A0J(context, ((AnonymousClass21D) r3).A00);
                if (A0J != null && A0J.length() != 0) {
                    SpannableStringBuilder A09 = AnonymousClass3MW.A09(A0J);
                    C18070vi.A0b(context);
                    A09.setSpan(new ForegroundColorSpan(AnonymousClass724.A00(context)), 0, A0J.length(), 0);
                    TextView textView = A00.A06;
                    textView.setText(A09);
                    textView.setVisibility(0);
                    A00.A01.setVisibility(0);
                }
            }
        } else if (this instanceof AnonymousClass2N3) {
            boolean A162 = C18070vi.A16(r11, view);
            C18070vi.A0d(r10, 3);
            r10.A03(view, r11, A162);
            C136606u5 A002 = AnonymousClass6WB.A00(view);
            Context context2 = view.getContext();
            ImageView imageView = A002.A02;
            if (imageView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int A01 = C62762rw.A01(context2, 4.0f);
                ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(imageView);
                A0P.setMargins(A01, A01, A01, A01);
                imageView.setLayoutParams(A0P);
            }
            AnonymousClass4aO.A02(imageView);
        } else if (this instanceof AnonymousClass2N2) {
            C18070vi.A0S(view, r10, r11);
        } else if (this instanceof AnonymousClass2N1) {
            C18070vi.A0S(view, r10, r11);
        } else if (this instanceof AnonymousClass2N0) {
            C18070vi.A0S(view, r10, r11);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void CFE(android.view.View r17, X.AnonymousClass724 r18, X.AnonymousClass206 r19, X.C135486sH r20) {
        /*
            r16 = this;
            r4 = r19
            r1 = r16
            boolean r0 = r1 instanceof X.C120636Er
            r5 = r20
            r7 = r18
            r8 = r17
            if (r0 == 0) goto L_0x0026
            r1 = 0
            X.C18070vi.A0o(r8, r5, r7)
            r7.A02(r8, r4, r5)
            X.6u5 r0 = X.AnonymousClass6WB.A00(r8)
            com.whatsapp.stickers.StickerView r2 = r0.A0B
            r2.setVisibility(r1)
            X.10I r1 = r7.A0G
            r0 = 21
            X.C98714rb.A00(r1, r7, r4, r2, r0)
        L_0x0025:
            return
        L_0x0026:
            boolean r0 = r1 instanceof X.C120646Es
            if (r0 == 0) goto L_0x0073
            X.6Es r1 = (X.C120646Es) r1
            r6 = 0
            X.C72473Md.A1I(r8, r7)
            X.2r9 r0 = r1.A00
            java.lang.String r5 = r0.A02(r4)
            if (r5 == 0) goto L_0x0025
            android.content.Context r3 = r8.getContext()
            X.6u5 r2 = X.AnonymousClass6WB.A00(r8)
            X.205 r0 = r4.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0061
            X.C18070vi.A0b(r3)
            int r1 = X.AnonymousClass724.A00(r3)
        L_0x004d:
            android.view.View r0 = r2.A00
            r0.setBackgroundColor(r1)
            r0.setVisibility(r6)
            com.whatsapp.TextEmojiLabel r0 = r2.A0A
            r0.setTextColor(r1)
            r0.setText(r5)
            r0.setVisibility(r6)
            return
        L_0x0061:
            X.C18070vi.A0b(r3)
            r1 = 2130970893(0x7f04090d, float:1.7550509E38)
            r0 = 2131102331(0x7f060a7b, float:1.7817097E38)
            int r0 = X.AnonymousClass1YL.A01(r3, r1, r0, r6)
            int r1 = X.C19740yt.A00(r3, r0)
            goto L_0x004d
        L_0x0073:
            boolean r0 = r1 instanceof X.AnonymousClass2N2
            if (r0 == 0) goto L_0x00a6
            r1 = 0
            X.C18070vi.A0o(r8, r5, r7)
            r7.A02(r8, r4, r5)
            boolean r0 = r4 instanceof X.C442222p
            if (r0 == 0) goto L_0x0025
            X.6u5 r0 = X.AnonymousClass6WB.A00(r8)
            android.widget.ImageView r11 = r0.A04
            r11.setVisibility(r1)
            X.1VW r2 = r7.A03
            r1 = 0
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            r2.A0B(r11, r1, r0)
            X.118 r5 = r7.A08
            X.1M9 r3 = r7.A04
            X.11C r2 = r7.A07
            X.0vb r1 = r7.A09
            X.73Y r0 = new X.73Y
            r0.<init>(r3, r2, r5, r1)
            X.22p r4 = (X.C442222p) r4
            monitor-enter(r4)
            goto L_0x015a
        L_0x00a6:
            boolean r0 = r1 instanceof X.AnonymousClass2N1
            if (r0 == 0) goto L_0x0110
            r2 = 0
            boolean r9 = X.C18070vi.A17(r4, r8)
            X.C18070vi.A0k(r5, r7)
            r7.A02(r8, r4, r5)
            boolean r0 = r4 instanceof X.AnonymousClass22U
            if (r0 == 0) goto L_0x0025
            X.22U r4 = (X.AnonymousClass22U) r4
            java.lang.String r6 = r4.A07
            if (r6 == 0) goto L_0x0025
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0025
            X.6u5 r1 = X.AnonymousClass6WB.A00(r8)
            com.whatsapp.TextEmojiLabel r0 = r1.A09
            com.whatsapp.TextEmojiLabel r5 = r1.A07
            android.widget.ImageView r4 = r1.A02
            r0.setMaxLines(r9)
            r5.setVisibility(r2)
            android.content.Context r3 = r8.getContext()
            android.text.TextPaint r2 = r5.getPaint()
            r0 = 512(0x200, float:7.175E-43)
            X.4mw r1 = new X.4mw
            r1.<init>(r9, r0)
            X.1KW r0 = r7.A0A
            java.lang.CharSequence r0 = X.C43251zV.A02(r3, r2, r1, r0, r6)
            r5.setText(r0)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168125(0x7f070b7d, float:1.7950543E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.width = r0
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168124(0x7f070b7c, float:1.795054E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.height = r0
            return
        L_0x0110:
            boolean r0 = r1 instanceof X.AnonymousClass2N0
            if (r0 == 0) goto L_0x01c3
            r3 = 0
            boolean r6 = X.C18070vi.A17(r4, r8)
            X.C18070vi.A0k(r5, r7)
            r7.A02(r8, r4, r5)
            boolean r0 = r4 instanceof X.AnonymousClass22Q
            if (r0 == 0) goto L_0x0025
            X.6u5 r2 = X.AnonymousClass6WB.A00(r8)
            com.whatsapp.TextEmojiLabel r1 = r2.A09
            X.A1M r0 = r7.A02
            X.22Q r4 = (X.AnonymousClass22Q) r4
            android.text.SpannableString r5 = r0.A01(r4)
            r1.setMaxLines(r6)
            if (r5 == 0) goto L_0x0025
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0025
            com.whatsapp.TextEmojiLabel r4 = r2.A07
            r4.setVisibility(r3)
            android.content.Context r3 = r8.getContext()
            android.text.TextPaint r2 = r4.getPaint()
            r0 = 512(0x200, float:7.175E-43)
            X.4mw r1 = new X.4mw
            r1.<init>(r6, r0)
            X.1KW r0 = r7.A0A
            java.lang.CharSequence r0 = X.C43251zV.A02(r3, r2, r1, r0, r5)
            r4.setText(r0)
            return
        L_0x015a:
            java.lang.Object r10 = r4.A0w     // Catch:{ all -> 0x01c0 }
            monitor-enter(r10)     // Catch:{ all -> 0x01c0 }
            X.2dU r9 = r4.A02     // Catch:{ all -> 0x01bd }
            monitor-exit(r10)     // Catch:{ all -> 0x01bd }
            if (r9 != 0) goto L_0x018d
            r9 = 0
            java.lang.String r6 = r4.A17()     // Catch:{ 1iZ -> 0x0187 }
            X.118 r5 = r0.A02     // Catch:{ 1iZ -> 0x0187 }
            X.1M9 r3 = r0.A00     // Catch:{ 1iZ -> 0x0187 }
            X.11C r2 = r0.A01     // Catch:{ 1iZ -> 0x0187 }
            X.0vb r1 = r0.A03     // Catch:{ 1iZ -> 0x0187 }
            X.73Y r0 = new X.73Y     // Catch:{ 1iZ -> 0x0187 }
            r0.<init>(r3, r2, r5, r1)     // Catch:{ 1iZ -> 0x0187 }
            r0.A05(r6)     // Catch:{ 1iZ -> 0x0187 }
            X.73C r0 = r0.A04     // Catch:{ 1iZ -> 0x0187 }
            X.2dU r3 = new X.2dU     // Catch:{ 1iZ -> 0x0187 }
            r3.<init>(r6, r0)     // Catch:{ 1iZ -> 0x0187 }
            monitor-enter(r10)     // Catch:{ 1iZ -> 0x0187 }
            r4.A02 = r3     // Catch:{ all -> 0x0184 }
            monitor-exit(r10)     // Catch:{ all -> 0x0184 }
            monitor-exit(r4)     // Catch:{ all -> 0x01c0 }
            goto L_0x0192
        L_0x0184:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0184 }
            throw r0     // Catch:{ 1iZ -> 0x0187 }
        L_0x0187:
            r1 = move-exception
            java.lang.String r0 = "Can't read VCard contact."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01c0 }
        L_0x018d:
            monitor-exit(r4)     // Catch:{ all -> 0x01c0 }
            r3 = r9
            if (r9 != 0) goto L_0x0192
            return
        L_0x0192:
            X.1Vd r2 = r7.A06
            android.content.Context r1 = r8.getContext()
            java.lang.String r0 = "message-reply-contact"
            X.1pZ r10 = r2.A05(r1, r0)
            X.73C r13 = r3.A01
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131168734(0x7f070dde, float:1.7951778E38)
            int r15 = r1.getDimensionPixelSize(r0)
            r14 = 0
            X.1Vd r0 = r10.A06
            X.1VW r2 = r0.A02
            X.1PU r1 = r0.A0E
            X.1VU r0 = r0.A0C
            X.1z3 r12 = new X.1z3
            r12.<init>(r2, r0, r1)
            r10.A06(r11, r12, r13, r14, r15)
            return
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01c0 }
            throw r0
        L_0x01c3:
            X.C18070vi.A0o(r8, r5, r7)
            r7.A02(r8, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145527Lp.CFE(android.view.View, X.724, X.206, X.6sH):void");
    }

    public final boolean BgB(AnonymousClass206 r2) {
        return true;
    }
}
