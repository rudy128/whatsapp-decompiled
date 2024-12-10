package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1b8  reason: invalid class name */
public abstract class AnonymousClass1b8 {
    public DataSetObserver A00;
    public final DataSetObservable A01 = new DataSetObservable();

    public Parcelable A0B() {
        return null;
    }

    public float A03(int i) {
        if (this instanceof AnonymousClass291) {
            return ((AnonymousClass291) this).A00.A03(i);
        }
        return 1.0f;
    }

    public void A04() {
        if (this instanceof AnonymousClass291) {
            ((AnonymousClass291) this).A00.A04();
            return;
        }
        synchronized (this) {
            DataSetObserver dataSetObserver = this.A00;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.A01.notifyChanged();
    }

    public void A05(DataSetObserver dataSetObserver) {
        if (this instanceof AnonymousClass291) {
            ((AnonymousClass291) this).A00.A05(dataSetObserver);
        } else {
            this.A01.registerObserver(dataSetObserver);
        }
    }

    public void A06(DataSetObserver dataSetObserver) {
        if (this instanceof AnonymousClass291) {
            ((AnonymousClass291) this).A00.A06(dataSetObserver);
        } else {
            this.A01.unregisterObserver(dataSetObserver);
        }
    }

    public void A07(Parcelable parcelable, ClassLoader classLoader) {
        if (this instanceof C45702Bd) {
            C45702Bd r4 = (C45702Bd) this;
            if (parcelable != null) {
                Bundle bundle = (Bundle) parcelable;
                bundle.setClassLoader(classLoader);
                long[] longArray = bundle.getLongArray("states");
                C001100p r8 = r4.A03;
                r8.A07();
                C001100p r5 = r4.A02;
                r5.A07();
                if (longArray != null) {
                    for (long j : longArray) {
                        r8.A0A(j, bundle.getParcelable(Long.toString(j)));
                    }
                }
                for (String next : bundle.keySet()) {
                    if (next.startsWith("f")) {
                        Fragment A0P = r4.A04.A0P(bundle, next);
                        if (A0P != null) {
                            A0P.A1a(false);
                            r5.A0A(Long.parseLong(next.substring(1)), A0P);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("FragmentPagerAdapter/Bad fragment at key ");
                            sb.append(next);
                            Log.w(sb.toString());
                        }
                    }
                }
            }
        } else if (this instanceof AnonymousClass291) {
            ((AnonymousClass291) this).A00.A07(parcelable, classLoader);
        } else if (this instanceof AnonymousClass292) {
            AnonymousClass292 r42 = (AnonymousClass292) this;
            if (parcelable != null) {
                Bundle bundle2 = (Bundle) parcelable;
                bundle2.setClassLoader(classLoader);
                Parcelable[] parcelableArray = bundle2.getParcelableArray("states");
                ArrayList arrayList = r42.A01;
                arrayList.clear();
                ArrayList arrayList2 = r42.A00;
                arrayList2.clear();
                if (parcelableArray != null) {
                    for (Parcelable add : parcelableArray) {
                        arrayList.add(add);
                    }
                }
                for (String next2 : bundle2.keySet()) {
                    if (next2.startsWith("f")) {
                        int parseInt = Integer.parseInt(next2.substring(1));
                        Fragment A0P2 = r42.A05.A0P(bundle2, next2);
                        if (A0P2 == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Bad fragment at key ");
                            sb2.append(next2);
                            android.util.Log.w("FragmentStatePagerAdapt", sb2.toString());
                        } else {
                            while (arrayList2.size() <= parseInt) {
                                arrayList2.add((Object) null);
                            }
                            A0P2.A1a(false);
                            arrayList2.set(parseInt, A0P2);
                        }
                    }
                }
            }
        }
    }

    public void A08(ViewGroup viewGroup) {
        if (this instanceof C28861b9) {
            if (viewGroup.getId() == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewPager with adapter ");
                sb.append(this);
                sb.append(" requires a view id");
                throw new IllegalStateException(sb.toString());
            }
        } else if (this instanceof C45702Bd) {
            if (viewGroup.getId() == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ViewPager with adapter ");
                sb2.append(this);
                sb2.append(" requires a view id");
                throw new IllegalStateException(sb2.toString());
            }
        } else if (this instanceof AnonymousClass291) {
            ((AnonymousClass291) this).A00.A08(viewGroup);
        } else if ((this instanceof AnonymousClass292) && viewGroup.getId() == -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ViewPager with adapter ");
            sb3.append(this);
            sb3.append(" requires a view id");
            throw new IllegalStateException(sb3.toString());
        }
    }

    public int A0A(Object obj) {
        if (this instanceof AnonymousClass291) {
            return ((AnonymousClass291) this).A00.A0A(obj);
        }
        if (this instanceof AnonymousClass290) {
            return ((AnonymousClass290) this).A0I(obj);
        }
        return -1;
    }

    public CharSequence A0C(int i) {
        if (this instanceof AnonymousClass291) {
            AnonymousClass1b8 r1 = ((AnonymousClass291) this).A00;
            if (r1.A0E() > 0) {
                return r1.A0C(i % r1.A0E());
            }
            Log.i("infinitepageadapter/getpagetitle/count is zero");
            return null;
        } else if (!(this instanceof AnonymousClass1bB)) {
            return null;
        } else {
            AnonymousClass1bB r12 = (AnonymousClass1bB) this;
            return r12.A0K(r12.A01.A4l(i));
        }
    }

    public int A0E() {
        if (this instanceof AnonymousClass1bB) {
            return ((AnonymousClass1bB) this).A00;
        }
        AnonymousClass1b8 r2 = ((AnonymousClass291) this).A00;
        int A0E = r2.A0E();
        int A0E2 = r2.A0E();
        if (A0E < 214748364) {
            return A0E2 * 10;
        }
        return A0E2;
    }

    public Object A0F(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public boolean A0H(View view, Object obj) {
        if (!(this instanceof C28861b9)) {
            if (this instanceof AnonymousClass291) {
                return ((AnonymousClass291) this).A00.A0H(view, obj);
            }
            if (this instanceof AnonymousClass290) {
                return ((AnonymousClass290) this).A0L(view, obj);
            }
        }
        if (((Fragment) obj).A0B == view) {
            return true;
        }
        return false;
    }

    public void A0D(ViewGroup viewGroup) {
    }

    public void A09(ViewGroup viewGroup, Object obj, int i) {
    }
}
