def stringUserMenu():
    print("1 . Pecah Kata ")
    print("2 . Gabungkan kata ")
    print("3 . Pop Kata ")
    print("4 . Kata terbalik")
    print("5 . Kembali")

while(True):
        print("1 . GAME KATA ")
        print("2 . KELUAR")
        userChoiceInput = (int(input("Pilihan anda : ")))

        if userChoiceInput == 1 :

            while(True):
                stringUserMenu()
                s = int (input("Pilih  : "))

                if s == 1 :
                    print("Game pecah kata ")
                    userStringInput = (input('Masukkan kata : '))
                    print("Akan dimasukkan ke variabel baru bertipe list")
                    userKataList = []
                    userKataList.append(userStringInput)
                    print(userKataList)
                    print("String sudah menjadi list dan akan dipecah " , "\n" ,[x for x in userStringInput])

                elif s == 2 :
                    userKataList = []
                    print("Game gabungkan kata ")
                    n = int(input("Masukkan jumlah kata  : "))

                    for n in range(n):                
                        userStringInput  =(input("Masukkan kata : "))
                        userKataList.append(userStringInput)  
                    print(userKataList)

                elif s == 3 :
                    userKataList = []
                    print("Game pop kata ")
                    n = int(input("Masukkan jumlah kata : "))

                    for n in range(n):
                        userStringInput = str(input("Masukkan kata : "))
                        userKataList.append(userStringInput)
                    print(userKataList)

                    inp = int(input("Jumlah penghilangan kata : "))                    

                    for popInput in range(inp):
                        popInput  = input("Masukkan kata yang ingin dihilangkan : ")
                        userKataList.remove(popInput)
                    print(userKataList)

                elif s ==4 :
                    userKataList = []
                    print("Game kebalikan kata")
                    print("aku merubah git hub")
                    n  = int(input("Berapa jumlah angka : "))

                    for n in range(n):
                        userStringInput = str(input("Masukkan kata : "))
                        userKataList.append(userStringInput)
                    print(userKataList)
                    userKataList.reverse()
                    print("\n" , end= " ")
                    print(userKataList)           

                elif  s == 5:
                    print("Ke menu utama")
                    break
                    
                else:
                    print("Pilih input yang tersedia (1 - 5 )!!!")
                    print("WDAwasasadas")
        elif userChoiceInput == 2 :
            print("Keluar ")
            break

        elif  userChoiceInput  > 2 :
            print("Input yang benar!!! (1-2)")