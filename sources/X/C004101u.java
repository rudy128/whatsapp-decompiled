package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: X.01u  reason: invalid class name and case insensitive filesystem */
public class C004101u implements C004001t, AdapterView.OnItemClickListener {
    public Context A00;
    public LayoutInflater A01;
    public ExpandedMenuView A02;
    public C004201v A03;
    public C003301m A04;
    public C004301w A05;

    public boolean BFB(AnonymousClass03G r2) {
        return false;
    }

    public boolean BKu(AnonymousClass03G r2) {
        return false;
    }

    public boolean BLO() {
        return false;
    }

    public void BdO(Context context, C003301m r3) {
        if (this.A00 != null) {
            this.A00 = context;
            if (this.A01 == null) {
                this.A01 = LayoutInflater.from(context);
            }
        }
        this.A04 = r3;
        C004201v r0 = this.A03;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void Bp9(C003301m r2, boolean z) {
        C004301w r0 = this.A05;
        if (r0 != null) {
            r0.Bp9(r2, z);
        }
    }

    public void C3a(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.A02.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public Parcelable C4J() {
        if (this.A02 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.A02;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public void CQu(boolean z) {
        C004201v r0 = this.A03;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A04.A0h(this.A03.getItem(i), this, 0);
    }

    public boolean C7B(AnonymousClass068 r2) {
        if (!r2.hasVisibleItems()) {
            return false;
        }
        new AnonymousClass0SD(r2).A00();
        C004301w r0 = this.A05;
        if (r0 == null) {
            return true;
        }
        r0.Bzb(r2);
        return true;
    }

    public int getId() {
        return 0;
    }

    public void CIA(C004301w r1) {
        this.A05 = r1;
    }
}
