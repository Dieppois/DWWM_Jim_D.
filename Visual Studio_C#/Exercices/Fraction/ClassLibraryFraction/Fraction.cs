﻿using System;

namespace ClassLibraryFraction
{
    public class Fraction
    {
        // Attributes
        private int numerateur;
        private int denominateur;

        // Properties
        public int Numerateur
        {
            get { return numerateur; }
            set { numerateur = value; }
        }
        public int Denominateur
        {
            get { return denominateur; }
            set { denominateur = value; }
        }

        // Constructors
        public Fraction()
        {
            this.Numerateur = 0;
            this.Denominateur = 1;
        }
        public Fraction(int _numerateur, int _denominateur)
        {
            this.Numerateur = _numerateur;
            this.Denominateur = _denominateur;
        }
        public Fraction(int _numerateur)
        {
            this.Numerateur = _numerateur;
            this.Denominateur = 1;
        }
        // Methods
        private float GetValue()
        {
            return (float)this.Numerateur/(float)this.Denominateur;
        }
        public override string ToString()
        {
            if (Numerateur == 0)
                return "0";
            else if (Numerateur % Denominateur == 0)
                return "" + Numerateur / Denominateur;
            else
                return Numerateur + "/" + Denominateur;
        }
        public void Oppose()
        {
            Numerateur = -Numerateur;
        }
        public void Inverse()
        {
            int temp = Numerateur;
            Numerateur = Denominateur;
            Denominateur = temp;
        }
        public string SuperieurA(Fraction _autreFraction)
        {
            if (this.GetValue() > _autreFraction.GetValue())
                return ToString() + " est supérieur à " + _autreFraction.ToString();

            else if (this.GetValue() < _autreFraction.GetValue())
                return ToString() + " n'est pas supérieur à " + _autreFraction.ToString();
            else
                return ToString() + " n'est pas supérieur à " + _autreFraction.ToString();
        }
        public string EgalA(Fraction _autreFraction)
        {
            if (this.GetValue() == _autreFraction.GetValue())
                return ToString() + " est égal à " + _autreFraction.ToString();

            else if (this.GetValue() > _autreFraction.GetValue())
                return ToString() + " n'est pas égal à " + _autreFraction.ToString();
            else
                return ToString() + " n'est pas égal à " + _autreFraction.ToString();
        }
        private int GetPgcd()
        {
            int a = this.Numerateur;
            int b = this.Denominateur;
            int pgcd = -1;
            if (a != 0 && b != 0)
            {
                if (a < 0) a = -a;
                if (b < 0) b = -b;
                while (a != b)
                {
                    if (a < b)
                    {
                        b = b - a;
                    }
                    else
                    {
                        a = a - b;
                    }
                    pgcd = a;
                }
            }
            return pgcd;
        }
        public void Reduire()
        {
                this.Numerateur = Numerateur / GetPgcd();
                this.Denominateur = Denominateur / GetPgcd();
        }

        public Fraction Plus(Fraction _autreFraction)
        {
            return new Fraction((this.Numerateur * _autreFraction.Denominateur + _autreFraction.Numerateur * this.Denominateur),
                                           this.Denominateur * _autreFraction.Denominateur);
        }
        public Fraction Moins(Fraction _autreFraction)
        {
            return new Fraction((this.Numerateur * _autreFraction.Denominateur - _autreFraction.Numerateur * this.Denominateur),
                                           this.Denominateur * _autreFraction.Denominateur);
        }
        public Fraction Multiplie(Fraction _autreFraction)
        {
            return new Fraction(this.Numerateur * _autreFraction.Numerateur,
                                           this.Denominateur * _autreFraction.Denominateur);
        }
        public Fraction Divise(Fraction _autreFraction)
        {
            _autreFraction.Inverse();
            return Multiplie(_autreFraction);
        }




    }
}
