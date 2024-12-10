package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.1bC  reason: invalid class name and case insensitive filesystem */
public final class C28871bC {
    public int A00 = 0;
    public ImageView A01 = null;
    public final View A02;
    public final ViewGroup A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;

    public C28871bC(View view, ViewGroup viewGroup, ImageView imageView, TextView textView, TextView textView2) {
        C18070vi.A0d(view, 1);
        C18070vi.A0d(textView, 2);
        C18070vi.A0d(textView2, 3);
        C18070vi.A0d(imageView, 4);
        C18070vi.A0d(viewGroup, 5);
        this.A02 = view;
        this.A06 = textView;
        this.A05 = textView2;
        this.A04 = imageView;
        this.A03 = viewGroup;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28871bC) {
                C28871bC r5 = (C28871bC) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((((((((this.A02.hashCode() * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31;
        ImageView imageView = this.A01;
        return ((hashCode + (imageView == null ? 0 : imageView.hashCode())) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TabViewHolder(tabView=");
        sb.append(this.A02);
        sb.append(", titleView=");
        sb.append(this.A06);
        sb.append(", badgeView=");
        sb.append(this.A05);
        sb.append(", iconView=");
        sb.append(this.A04);
        sb.append(", tabContainer=");
        sb.append(this.A03);
        sb.append(", iconBadge=");
        sb.append(this.A01);
        sb.append(", badgeCount=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
