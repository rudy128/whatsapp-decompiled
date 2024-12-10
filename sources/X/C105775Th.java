package X;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Th  reason: invalid class name and case insensitive filesystem */
public final class C105775Th extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterAlertsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105775Th(NewsletterAlertsActivity newsletterAlertsActivity) {
        super(1);
        this.this$0 = newsletterAlertsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass5YD r10 = (AnonymousClass5YD) obj;
        NewsletterAlertsActivity newsletterAlertsActivity = this.this$0;
        C28931bI r0 = newsletterAlertsActivity.A07;
        if (r0 != null) {
            r0.A02().setVisibility(8);
            C28931bI r02 = newsletterAlertsActivity.A05;
            if (r02 != null) {
                AnonymousClass3MY.A1T(r02, 8);
                C28931bI r03 = newsletterAlertsActivity.A06;
                if (r03 != null) {
                    AnonymousClass3MY.A1T(r03, 8);
                    RecyclerView recyclerView = newsletterAlertsActivity.A00;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                        if (r10 instanceof C97144oz) {
                            RecyclerView recyclerView2 = this.this$0.A00;
                            if (recyclerView2 != null) {
                                recyclerView2.setVisibility(0);
                                AnonymousClass3X2 r4 = this.this$0.A02;
                                if (r4 == null) {
                                    str = "adapter";
                                    C18070vi.A11(str);
                                    throw null;
                                }
                                List list = ((C97144oz) r10).A00;
                                C18070vi.A0d(list, 0);
                                if (!list.isEmpty()) {
                                    C29431cG.A0y(list, new C98924rw(12));
                                    ArrayList A10 = C17880vN.A10(list);
                                    Iterator it = A10.iterator();
                                    int i = 0;
                                    int i2 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        } else if (it.next() instanceof AnonymousClass454) {
                                            int i3 = -1;
                                            if (i2 != -1) {
                                                Iterator it2 = A10.iterator();
                                                int i4 = 0;
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    } else if (!(it2.next() instanceof AnonymousClass456)) {
                                                        i4++;
                                                    } else if (i4 != -1) {
                                                        Iterator it3 = A10.iterator();
                                                        int i5 = 0;
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (it3.next() instanceof AnonymousClass454) {
                                                                    break;
                                                                }
                                                                i5++;
                                                            } else {
                                                                i5 = -1;
                                                                break;
                                                            }
                                                        }
                                                        A10.add(i5, new AnonymousClass455(2131888110));
                                                        Iterator it4 = A10.iterator();
                                                        while (true) {
                                                            if (!it4.hasNext()) {
                                                                break;
                                                            } else if (it4.next() instanceof AnonymousClass456) {
                                                                i3 = i;
                                                                break;
                                                            } else {
                                                                i++;
                                                            }
                                                        }
                                                        A10.add(i3, new AnonymousClass455(2131888111));
                                                    }
                                                }
                                            }
                                        } else {
                                            i2++;
                                        }
                                    }
                                    r4.A00 = A10;
                                    r4.notifyDataSetChanged();
                                }
                            }
                        } else if (r10 instanceof C97154p0) {
                            NewsletterAlertsActivity newsletterAlertsActivity2 = this.this$0;
                            C28931bI r04 = newsletterAlertsActivity2.A05;
                            if (r04 != null) {
                                AnonymousClass3MY.A1T(r04, 0);
                                WaTextView waTextView = (WaTextView) AnonymousClass3MY.A0H(newsletterAlertsActivity2, 2131430387);
                                String A102 = AnonymousClass3Ma.A10(newsletterAlertsActivity2, "clickable-span", AnonymousClass3MW.A1a(), 0, 2131889746);
                                C36401np r3 = newsletterAlertsActivity2.A04;
                                if (r3 != null) {
                                    waTextView.setText(r3.A06(newsletterAlertsActivity2, new C21448AkF(newsletterAlertsActivity2, 42), A102, "clickable-span", C72473Md.A05(waTextView)));
                                    C72473Md.A1D(waTextView);
                                } else {
                                    str = "linkifier";
                                    C18070vi.A11(str);
                                    throw null;
                                }
                            }
                        } else if (r10 instanceof C97174p2) {
                            C28931bI r05 = this.this$0.A07;
                            if (r05 != null) {
                                AnonymousClass3MY.A1T(r05, 0);
                            }
                        } else {
                            boolean z = r10 instanceof C97184p3;
                            if (z || (r10 instanceof C97164p1)) {
                                NewsletterAlertsActivity newsletterAlertsActivity3 = this.this$0;
                                C28931bI r06 = newsletterAlertsActivity3.A06;
                                if (r06 != null) {
                                    AnonymousClass3MY.A1T(r06, 0);
                                    TextView A0L = AnonymousClass3MX.A0L(newsletterAlertsActivity3, 2131430780);
                                    int i6 = 2131892757;
                                    if (z) {
                                        i6 = 2131892758;
                                    }
                                    A0L.setText(i6);
                                    C89964dJ.A00(newsletterAlertsActivity3.findViewById(2131430781), newsletterAlertsActivity3, 16);
                                }
                            }
                        }
                        return C27621Wu.A00;
                    }
                    str = "recyclerView";
                    C18070vi.A11(str);
                    throw null;
                }
                str = "genericErrorLayout";
                C18070vi.A11(str);
                throw null;
            }
            str = "emptyResultsLayout";
            C18070vi.A11(str);
            throw null;
        }
        str = "loadingIndicator";
        C18070vi.A11(str);
        throw null;
    }
}
