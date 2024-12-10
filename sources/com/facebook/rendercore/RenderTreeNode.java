package com.facebook.rendercore;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass0ME;
import X.AnonymousClass1DF;
import X.C04240Mk;
import X.C05050Qf;
import X.C09350gZ;
import X.C18070vi;
import X.C18100vl;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class RenderTreeNode {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Rect A03;
    public final Rect A04;
    public final AnonymousClass0ME A05;
    public final RenderTreeNode A06;
    public final C05050Qf A07;
    public final Object A08;
    public final C18100vl A09;

    public RenderTreeNode(Rect rect, Rect rect2, AnonymousClass0ME r6, RenderTreeNode renderTreeNode, C05050Qf r8, Object obj, int i) {
        int i2;
        C18070vi.A0d(r6, 7);
        this.A06 = renderTreeNode;
        this.A07 = r8;
        this.A08 = obj;
        this.A03 = rect;
        this.A04 = rect2;
        this.A02 = i;
        this.A05 = r6;
        int i3 = 0;
        if (renderTreeNode != null) {
            i2 = renderTreeNode.A00;
        } else {
            i2 = 0;
        }
        this.A00 = i2 + rect.left;
        this.A01 = (renderTreeNode != null ? renderTreeNode.A01 : i3) + rect.top;
        this.A09 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, C09350gZ.A00);
    }

    public static final List A00(RenderTreeNode renderTreeNode) {
        return (List) renderTreeNode.A09.getValue();
    }

    public final String A01(C04240Mk r12) {
        int i;
        long j;
        C05050Qf r2 = this.A07;
        long A0C = r2.A0C();
        String A0E = r2.A0E();
        if (r12 != null) {
            i = AnonymousClass000.A0M(r12.A01.A06(-1, A0C));
        } else {
            i = -1;
        }
        String shortString = this.A03.toShortString();
        C18070vi.A0X(shortString);
        int size = A00(this).size();
        RenderTreeNode renderTreeNode = this.A06;
        if (renderTreeNode != null) {
            j = renderTreeNode.A07.A0C();
        } else {
            j = -1;
        }
        String format = String.format(Locale.US, "Id=%d; renderUnit='%s'; indexInTree=%d; posInParent=%d; bounds=%s; absPosition=[%d, %d]; childCount=%d; parentId=%d;", Arrays.copyOf(new Object[]{Long.valueOf(A0C), A0E, Integer.valueOf(i), Integer.valueOf(this.A02), shortString, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(size), Long.valueOf(j)}, 9));
        C18070vi.A0X(format);
        return format;
    }
}
