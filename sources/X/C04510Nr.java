package X;

import com.facebook.rendercore.RenderTreeNode;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0Nr  reason: invalid class name and case insensitive filesystem */
public final class C04510Nr {
    public static final String A00(C04240Mk r11) {
        Locale locale = Locale.US;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RenderTree details:\n");
        String format = String.format(locale, "Full child list (size = %d):\n", Arrays.copyOf(new Object[]{Integer.valueOf(r4)}, 1));
        C18070vi.A0X(format);
        A10.append(format);
        for (RenderTreeNode renderTreeNode : r11.A04) {
            int i = 0;
            for (RenderTreeNode renderTreeNode2 = renderTreeNode.A06; renderTreeNode2 != null; renderTreeNode2 = renderTreeNode2.A06) {
                i++;
            }
            A10.append(AnonymousClass1YE.A05("  ", i));
            String format2 = String.format(locale, "%s\n", Arrays.copyOf(new Object[]{renderTreeNode.A01(r11)}, 1));
            C18070vi.A0X(format2);
            A10.append(format2);
        }
        String obj = A10.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public static final void A01(C001100p r10, C04240Mk r11, int i) {
        RenderTreeNode[] renderTreeNodeArr = r11.A04;
        RenderTreeNode renderTreeNode = renderTreeNodeArr[i];
        int A0M = AnonymousClass000.A0M(r10.A06(-1, renderTreeNode.A07.A0C()));
        if (A0M != -1) {
            RenderTreeNode renderTreeNode2 = renderTreeNodeArr[A0M];
            long A0C = renderTreeNode.A07.A0C();
            String format = String.format(Locale.US, "RenderTrees must not have RenderUnits with the same ID:\nAttempted to add item with existing ID at index %d: %s\nExisting item at index %d: %s\nFull RenderTree: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), renderTreeNode.A01((C04240Mk) null), Integer.valueOf(A0M), renderTreeNode2.A01((C04240Mk) null), A00(r11)}, 5));
            C18070vi.A0X(format);
            throw new AnonymousClass0CY(A0C, format);
        }
    }
}
