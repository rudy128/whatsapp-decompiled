package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.quickcontact.QuickContactActivity;
import org.npci.upi.security.pinactivitycomponent.GetCredential;
import org.npci.upi.security.pinactivitycomponent.w;

/* renamed from: X.AFa  reason: case insensitive filesystem */
public class C20292AFa implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public C20292AFa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        boolean z;
        int i;
        switch (this.A00) {
            case 0:
                ProductListActivity productListActivity = (ProductListActivity) this.A01;
                C18070vi.A0d(motionEvent, 2);
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action != 2) {
                        return false;
                    }
                    RecyclerView recyclerView = productListActivity.A03;
                    if (recyclerView == null) {
                        str = "productListRecyclerView";
                    } else if (recyclerView.canScrollVertically(-1) || !productListActivity.A0P) {
                        return false;
                    } else {
                        AnonymousClass8I0 r2 = productListActivity.A0E;
                        if (r2 != null) {
                            if (r2.A0U()) {
                                return false;
                            }
                            r2.A05.add(0, new Object());
                            r2.A0H(0);
                            return false;
                        }
                        C18070vi.A11("productSectionsListAdapter");
                        throw null;
                    }
                } else if (!productListActivity.A0P) {
                    return false;
                } else {
                    AnonymousClass8I0 r0 = productListActivity.A0E;
                    if (r0 != null) {
                        if (!r0.A0U()) {
                            return false;
                        }
                        AnonymousClass8I0 r1 = productListActivity.A0E;
                        if (r1 != null) {
                            if (r1.A0U()) {
                                r1.A05.remove(0);
                                r1.A0I(0);
                            }
                            if (!productListActivity.A07.A09()) {
                                return false;
                            }
                            AnonymousClass8F5 r4 = productListActivity.A0F;
                            if (r4 == null) {
                                str = "productListViewModel";
                            } else {
                                r4.A07.A01(r4.A09, AnonymousClass9QG.A00(), new C22132AyA(r4));
                                productListActivity.A0P = false;
                                return false;
                            }
                        }
                    }
                    C18070vi.A11("productSectionsListAdapter");
                    throw null;
                }
                C18070vi.A11(str);
                throw null;
            case 1:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A01;
                if (quickContactActivity.A0h.A02 != 2) {
                    return true;
                }
                QuickContactActivity.A0V(quickContactActivity, true);
                return true;
            case 2:
                z = false;
                if (view.getId() == 2131436356) {
                    i = motionEvent.getAction();
                    break;
                } else {
                    return false;
                }
            case 3:
                i = motionEvent.getAction();
                z = false;
                break;
            default:
                AnonymousClass8Do r3 = (AnonymousClass8Do) this.A01;
                if (r3.A0H == null || motionEvent.getAction() != 1) {
                    return false;
                }
                B6S b6s = r3.A0H;
                int i2 = r3.A01;
                w wVar = (w) b6s;
                if (wVar.A04.get(i2) instanceof AnonymousClass8DP) {
                    return false;
                }
                wVar.A03 = i2;
                return false;
        }
        if (i != 1) {
            return false;
        }
        GetCredential getCredential = (GetCredential) this.A01;
        if (getCredential.A04.getVisibility() != 0) {
            return false;
        }
        GetCredential.A03(getCredential, z);
        return true;
    }
}
