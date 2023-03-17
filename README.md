# Turkcell-Homework
## Gereksinimler
* Oyuncuların sisteme kayıt olabileceği, bilgilerini güncelleyebileceği, kayıtlarını silebileceği bir ortamın simule edilmesi.
* Girilen müşteri bilgilerinin doğruluğunun, e-devlet sistemlerine benzer şekilde kontrol edilmesi.
* Oyun satışı yapılabilecek satış ortamının simule edilmesi(yapılan satışlar oyuncu ile ilişkilendirilmeli).
* Sisteme yeni kampanya girişi, kampanyanın silinmesi ve güncellenmesi imkanlarının simule edilmesi.
* Satışlarda kampanya entegrasyonunun simule edilmesi.

## Kullanım
### Kayıt Olma
* Sisteme kayıt olmak için ilk olarak, Main'de Customer sınıfı kullanılarak bir müşteri referansı oluşturulmalıdır.
* Daha sonra UserManager sınıfı kullanılarak müşteri kaydı gerçekleştirilebilir.
* Müşteri bilgileri MernisService sınıfının içindeki checkUser metodu kullanılarak doğrulanır, başarılı olursa müşteri kaydı gerçekleştirilir.

### Oyun İşlemleri
* Game sınıfı kullanılarak bir oyun referansı oluşturulmalıdır.
* Game sınıfındaki yapıcı metoda oyunun id, name, cost, description ve countOwner bilgileri girilmeli. Bu bilgilere sahip oyun nesnesi oluşturulur.
* GameManager sınıfındaki addGame, deleteGame, updateGame metotları ile ekleme, silme ve güncelleme işlemleri yapılabilir.

### Satış Yapma
* Satış yapmak için ilk olarak Game sınıfı kullanılarak bir oyun referansı oluşturulmalıdır.
* Satış işlemi sırasında müşteri ve oyun bilgileri parametre olarak sell metoduna verilmelidir.
* SellingManager sınıfı kullanılarak satış işlemi gerçekleştirilebilir.
* Eğer satış sırasında bir kampanya kullanılacaksa, Campaign sınıfı kullanılarak kampanya oluşturulmalıdır.

### Kampanya Oluşturma
* Yeni bir kampanya oluşturmak için Campaign sınıfından yeni bir kampanya oluşturulmalıdır.
* Campaign sınıfının yapıcı metoduna id, indirim yüzdesi, indirim süresi ve hangi oyunun kampanyalı olmasını isteniliyorsa o oyunun referansı verilmelidir.
* Kampanya oluşturulduktan sonra CampaignManager sınıfındaki addCampaign metodu kullanılarak kampanya sisteme eklenmelidir.
* Kampanyanın bilgilerini güncellenmesi için updateCampaign, silinmesi için deleteCampaign metodu kullanılmalıdır.

### Kampanyalı Satış
* SellingManager sınıfındaki sell metodunun içindeki for döngüsünde eğer oyun kampanyaya girmiş ise indirim oranına göre yeni fiyatı hesaplanır. Eğer müşteri oyunu daha önceden satın almamışsa, oyun listesine satın aldığı oyun eklenir.

<br />
<img src="https://user-images.githubusercontent.com/69295311/225978643-841ffa85-cc3c-497f-8ce9-1516fabb4de9.png" />

