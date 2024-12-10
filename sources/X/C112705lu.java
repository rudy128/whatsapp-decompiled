package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.bot.home.AiHomeFragment;
import java.util.Map;

/* renamed from: X.5lu  reason: invalid class name and case insensitive filesystem */
public class C112705lu extends C39711tW {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C112705lu(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void A03(RecyclerView recyclerView, int i) {
        String str;
        if (1 - this.A00 != 0) {
            super.A03(recyclerView, i);
            return;
        }
        C115875vy r1 = (C115875vy) this.A02;
        C143257Cr r0 = r1.A00;
        Parcelable parcelable = null;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = null;
        }
        if (i == 0 && str != null) {
            Map map = r1.A03;
            C38251qy layoutManager = ((RecyclerView) this.A01).getLayoutManager();
            if (layoutManager != null) {
                parcelable = layoutManager.A0u();
            }
            map.put(str, parcelable);
        }
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        if (this.A00 != 0) {
            super.A04(recyclerView, i, i2);
        } else if (i2 > 0) {
            AiHomeFragment aiHomeFragment = (AiHomeFragment) this.A02;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A01;
            C18070vi.A0d(linearLayoutManager, 0);
            if (linearLayoutManager.A1Q() + 3 >= linearLayoutManager.A0K()) {
                C108945cZ.A0b(aiHomeFragment.A04).A0F.CPw(C27621Wu.A00);
            }
        }
    }
}
