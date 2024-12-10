package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel;

/* renamed from: X.8wQ  reason: invalid class name and case insensitive filesystem */
public final class C174218wQ extends C174358we {
    public final BusinessDirectoryConsumerHomeViewModel A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C174218wQ) && C18070vi.A18(this.A00, ((C174218wQ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C174218wQ(BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel) {
        super(30);
        this.A00 = businessDirectoryConsumerHomeViewModel;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProminentSearchBarListItemData(searchBarClickListener=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
