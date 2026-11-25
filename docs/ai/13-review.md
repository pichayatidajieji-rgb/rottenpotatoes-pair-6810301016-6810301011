| บรรทัดในร่าง | ปัญหา | ตัดสิน |
| --- | --- | --- |
| 23: "shall reject the call with an error that names the five allowed ratings" (REQ-10) | ผู้ปกครองเลือกจาก 5 ค่า ไม่ได้พิมพ์เอง ลูกค้าไม่ได้ขอ | ตัด |
| 22: "shall return an empty list and shall not throw an exception" (REQ-9) | ตอบ open question ข้อ 1 แทนลูกค้า | แก้: ถาม customer proxy |
| 41: "The selection takes one call" (AC-1.5) | one call วัดจากโค้ด ไม่ใช่สิ่งที่ผู้ใช้เห็น จึงไม่ Measurable | ตัด |
| 80: "### Story 3: Clear empty result" | เป็น sad path ของ story 1 ไม่ใช่ story ใหม่ | แก้: เป็นบัตรใบที่ 3 |
| 110: "**Suitability is not the same as rating.**" | ข้อกังวลที่ถูกต้อง | เก็บ |