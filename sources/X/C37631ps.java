package X;

import android.content.res.Resources;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1ps  reason: invalid class name and case insensitive filesystem */
public class C37631ps extends C37621pr {
    public ViewGroup A00;
    public HorizontalScrollView A01;
    public ImageButton A02;
    public ImageView A03;
    public LinearLayout A04;
    public RelativeLayout A05;
    public TextView A06;
    public TextView A07;
    public C28931bI A08;
    public C28931bI A09;
    public final C37451pZ A0A;
    public final C18000vb A0B;
    public final Map A0C = new HashMap();
    public final C24921Me A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C37631ps(X.C37551pj r11, X.AnonymousClass1M9 r12, X.C24921Me r13, X.C24791Lr r14, X.C37451pZ r15, com.whatsapp.conversationslist.ConversationsFragment r16, X.C18000vb r17, X.AnonymousClass18K r18, X.C37611pq r19, X.AnonymousClass10I r20) {
        /*
            r10 = this;
            r0 = 1
            r9 = r20
            X.C18070vi.A0d(r9, r0)
            r0 = 2
            r7 = r18
            X.C18070vi.A0d(r7, r0)
            r0 = 3
            r4 = r12
            X.C18070vi.A0d(r12, r0)
            r0 = 4
            X.C18070vi.A0d(r13, r0)
            r0 = 5
            r1 = r17
            X.C18070vi.A0d(r1, r0)
            r0 = 6
            r3 = r11
            X.C18070vi.A0d(r11, r0)
            r0 = 7
            r5 = r14
            X.C18070vi.A0d(r14, r0)
            r0 = 8
            X.C18070vi.A0d(r15, r0)
            r0 = 10
            r8 = r19
            X.C18070vi.A0d(r8, r0)
            r2 = r10
            r6 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.A0D = r13
            r10.A0B = r1
            r10.A0A = r15
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r10.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37631ps.<init>(X.1pj, X.1M9, X.1Me, X.1Lr, X.1pZ, com.whatsapp.conversationslist.ConversationsFragment, X.0vb, X.18K, X.1pq, X.10I):void");
    }

    public final void A04(ViewGroup viewGroup, AnonymousClass1FL r13, ArrayList arrayList, int i) {
        if (this.A04 != null && arrayList.size() > 1) {
            A03(false);
            LinearLayout linearLayout = this.A04;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            boolean z = this instanceof C37641pt;
            if (z) {
                this.A0C.clear();
            }
            LayoutInflater from = LayoutInflater.from(r13);
            if (from != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj = arrayList.get(i2);
                    C18070vi.A0X(obj);
                    AnonymousClass1E7 r3 = (AnonymousClass1E7) obj;
                    View inflate = from.inflate(2131623997, viewGroup, false);
                    if (i2 > 0) {
                        C18070vi.A0b(inflate);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginStart(viewGroup.getResources().getDimensionPixelSize(2131166931));
                        inflate.setLayoutParams(layoutParams);
                    }
                    ImageView imageView = (ImageView) inflate.findViewById(2131433245);
                    imageView.setImportantForAccessibility(2);
                    AnonymousClass1BI r0 = r3.A0J;
                    if (r0 != null && z) {
                        this.A0C.put(r0.user, imageView);
                    }
                    this.A0A.A07(imageView, r3);
                    String escapeHtml = Html.escapeHtml(this.A0D.A0T(r3, -1));
                    if (escapeHtml != null) {
                        ((TextView) inflate.findViewById(2131433244)).setText(Html.fromHtml(escapeHtml));
                    }
                    LinearLayout linearLayout2 = this.A04;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(inflate);
                    }
                    inflate.setOnClickListener(new C177679Ad(r3, i2, 3, this));
                }
                if (i > 15) {
                    View inflate2 = from.inflate(2131624000, viewGroup, false);
                    C18070vi.A0b(inflate2);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.setMarginStart(viewGroup.getResources().getDimensionPixelSize(2131166931));
                    inflate2.setLayoutParams(layoutParams2);
                    LinearLayout linearLayout3 = this.A04;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(inflate2);
                    }
                    inflate2.setOnClickListener(new C825048f(this, 34));
                    ImageButton imageButton = (ImageButton) inflate2.findViewById(2131436790);
                    this.A02 = imageButton;
                    if (imageButton != null) {
                        imageButton.setImportantForAccessibility(2);
                    }
                    ImageButton imageButton2 = this.A02;
                    if (imageButton2 != null && C18000vb.A00(this.A0B).A06) {
                        imageButton2.setRotationY(180.0f);
                    }
                }
            }
        }
    }

    public final void A05(AnonymousClass1FL r9, ArrayList arrayList, int i) {
        C18070vi.A0d(arrayList, 1);
        Resources resources = r9.getResources();
        boolean z = true;
        int max = Math.max(i, 1);
        String quantityString = resources.getQuantityString(2131755101, max, new Object[]{Integer.valueOf(max)});
        C18070vi.A0X(quantityString);
        TextView textView = this.A06;
        if (textView != null) {
            textView.setText(quantityString);
        }
        TextView textView2 = this.A07;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        ImageView imageView = this.A03;
        HorizontalScrollView horizontalScrollView = this.A01;
        if (arrayList.size() > 1) {
            z = false;
        }
        int i2 = 0;
        if (imageView != null) {
            int i3 = 8;
            if (z) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
        }
        if (horizontalScrollView != null) {
            if (z) {
                i2 = 8;
            }
            horizontalScrollView.setVisibility(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r4 = r5.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(boolean r6) {
        /*
            r5 = this;
            X.1bI r1 = r5.A09
            if (r1 == 0) goto L_0x0038
            r0 = 8
            if (r6 == 0) goto L_0x0009
            r0 = 0
        L_0x0009:
            r1.A04(r0)
            if (r6 == 0) goto L_0x0038
            android.view.View r1 = r1.A02()
            X.C18070vi.A0X(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r0 = r1.getChildCount()
            if (r0 != 0) goto L_0x0038
            com.whatsapp.conversationslist.ConversationsFragment r4 = r5.A06
            r0 = 0
            android.content.Context r3 = r4.A1n()
            if (r3 == 0) goto L_0x0038
            com.whatsapp.EmptyTellAFriendView r2 = new com.whatsapp.EmptyTellAFriendView
            r2.<init>((android.content.Context) r3, (boolean) r0)
            r1.addView(r2)
            r1 = 12
            X.4dO r0 = new X.4dO
            r0.<init>(r4, r3, r1)
            r2.setInviteButtonClickListener(r0)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37631ps.A06(boolean):void");
    }
}
