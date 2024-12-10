package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.settings.chat.wallpaper.WallpaperGridLayoutManager;
import java.util.List;

public class BLi extends C58342kX {
    public final int A00;
    public final Object A01;

    public BLi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public int A00(int i) {
        switch (this.A00) {
            case 2:
                GridLayoutManager gridLayoutManager = (GridLayoutManager) this.A01;
                if (i < 2) {
                    return gridLayoutManager.A00;
                }
                return 1;
            case 3:
                WallpaperGridLayoutManager wallpaperGridLayoutManager = (WallpaperGridLayoutManager) this.A01;
                int itemViewType = wallpaperGridLayoutManager.A01.getItemViewType(i);
                if (itemViewType == 0 || itemViewType == 1 || itemViewType == 2 || itemViewType == 3) {
                    return 4 / wallpaperGridLayoutManager.A00.getResources().getInteger(2131492941);
                }
                if (itemViewType == 4 || itemViewType == 5) {
                    return 4;
                }
                throw BE6.A0v(AnonymousClass001.A1I("Invalid viewType: ", AnonymousClass000.A10(), itemViewType));
            case 4:
                int itemViewType2 = ((BLj) this.A01).A00.getItemViewType(i);
                if (itemViewType2 == 0 || itemViewType2 == 1) {
                    return 1;
                }
                return 3;
            default:
                Number number = (Number) C29431cG.A0f((List) this.A01, i);
                if (number != null) {
                    return number.intValue();
                }
                return 1;
        }
    }
}
