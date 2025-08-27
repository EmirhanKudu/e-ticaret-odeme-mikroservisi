💳 Payment Service (Mikroservis) – Simüle Ödeme Altyapısı

Bu servis, e-ticaret sisteminde ödeme işlemlerini senkron olarak yöneten bağımsız bir mikroservistir.

Gerçek bir ödeme sistemi yerine ana mikroservisten girilip ödeme mikroservisine ulaşan kart numarasıyla ödeme işlemini simüle eder.

Order servisi bu servisi REST (Feign Client) ile çağırır; yanıt anında döner.

Burdan ödeme başarılı / başarısız yanıtına göre ana serviste sipariş oluşturulur/ oluşturulmaz.

🎯 Amaç & Özellikler

Senkron ödeme işlemi: Order servisi ödeme yanıtını bekler.

Simülasyon: Girilen kart numarasına göre simüle edilir.

Basit, temiz API: POST /api/payments



